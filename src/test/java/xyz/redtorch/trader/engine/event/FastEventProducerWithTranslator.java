package xyz.redtorch.trader.engine.event;

import com.lmax.disruptor.RingBuffer;

import com.lmax.disruptor.EventTranslatorOneArg;

public class FastEventProducerWithTranslator {
	private final RingBuffer<FastEvent> ringBuffer;

	public FastEventProducerWithTranslator(RingBuffer<FastEvent> ringBuffer) {
		this.ringBuffer = ringBuffer;
	}

	private static final EventTranslatorOneArg<FastEvent, String> TRANSLATOR = new EventTranslatorOneArg<FastEvent, String>() {
		public void translateTo(FastEvent fastEvent, long sequence, String event) {
			fastEvent.setEvent(event);
		}
	};

	public void onData(String event) {
		ringBuffer.publishEvent(TRANSLATOR, event);
	}
}