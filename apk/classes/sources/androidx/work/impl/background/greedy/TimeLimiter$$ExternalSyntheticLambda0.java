package androidx.work.impl.background.greedy;

import androidx.work.impl.StartStopToken;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class TimeLimiter$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ TimeLimiter f$0;
    public final /* synthetic */ StartStopToken f$1;

    public /* synthetic */ TimeLimiter$$ExternalSyntheticLambda0(TimeLimiter timeLimiter, StartStopToken startStopToken) {
        this.f$0 = timeLimiter;
        this.f$1 = startStopToken;
    }

    public final void run() {
        TimeLimiter.track$lambda$0(this.f$0, this.f$1);
    }
}
