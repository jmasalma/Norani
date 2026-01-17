package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzgcb<V> extends zzgcc<V> {

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzgcc.zzg) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zza(false, (Throwable) null);
            zza = new zza(true, (Throwable) null);
        }

        zza(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    final class zzb<V> implements Runnable {
        final zzgcb<V> zza;
        final ListenableFuture<? extends V> zzb;

        zzb(zzgcb zzgcb, ListenableFuture listenableFuture) {
            this.zza = zzgcb;
            this.zzb = listenableFuture;
        }

        public final void run() {
            if (this.zza.valueField == this) {
                if (zzgcc.zzv(this.zza, this, zzgcb.zze(this.zzb))) {
                    zzgcb.zzx(this.zza, false);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") {
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        static final zzc zzb = new zzc(new Throwable("Failure.exception is unexpectedly null.") {
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzc;

        zzc(Throwable th) {
            th.getClass();
            Throwable th2 = th;
            this.zzc = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    interface zze<V> extends ListenableFuture<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    abstract class zzf<V> extends zzgcb<V> implements zze<V> {
        zzf() {
        }
    }

    protected zzgcb() {
    }

    /* access modifiers changed from: private */
    public static Object zze(ListenableFuture listenableFuture) {
        Throwable zzi;
        if (listenableFuture instanceof zze) {
            Object obj = ((zzgcb) listenableFuture).valueField;
            if (obj instanceof zza) {
                zza zza2 = (zza) obj;
                if (zza2.zzc) {
                    Throwable th = zza2.zzd;
                    obj = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            return Objects.requireNonNull(obj);
        } else if ((listenableFuture instanceof zzger) && (zzi = ((zzger) listenableFuture).zzi()) != null) {
            return new zzc(zzi);
        } else {
            boolean isCancelled = listenableFuture.isCancelled();
            if ((!zzg) && isCancelled) {
                return Objects.requireNonNull(zza.zzb);
            }
            try {
                Object zzf2 = zzf(listenableFuture);
                if (!isCancelled) {
                    return zzf2 == null ? zze : zzf2;
                }
                String valueOf = String.valueOf(listenableFuture);
                return new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
            } catch (ExecutionException e) {
                if (isCancelled) {
                    return new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(String.valueOf(listenableFuture))), e));
                }
                return new zzc(e.getCause());
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(String.valueOf(listenableFuture))), e2));
                }
                return new zza(false, e2);
            } catch (Error | Exception e3) {
                return new zzc(e3);
            }
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    static Object zzh(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            Throwable th = ((zza) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            Throwable th2 = ((zzc) obj).zzc;
            if (th2 == null) {
                zzf.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "getDoneValue", "Failure.exception is unexpectedly null.");
                throw new ExecutionException(zzc.zzb.zzc);
            }
            throw new ExecutionException(th2);
        } else if (obj == zze) {
            return null;
        } else {
            return obj;
        }
    }

    static boolean zzm(Object obj) {
        return !(obj instanceof zzb);
    }

    private final void zzw(StringBuilder sb) {
        try {
            Object zzf2 = zzf(this);
            sb.append("SUCCESS, result=[");
            if (zzf2 == null) {
                sb.append("null");
            } else if (zzf2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzf2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzf2)));
            }
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* access modifiers changed from: private */
    public static void zzx(zzgcb<V> zzgcb, boolean z) {
        zzd zzd2 = null;
        while (true) {
            zzgcb.zzt();
            if (z) {
                zzgcb.zzk();
            }
            zzgcb.zzb();
            zzd zzd3 = zzd2;
            zzd zzp = zzgcb.zzp(zzd.zza);
            zzd zzd4 = zzd3;
            while (zzp != null) {
                zzd zzd5 = zzp.next;
                zzp.next = zzd4;
                zzd4 = zzp;
                zzp = zzd5;
            }
            while (zzd4 != null) {
                Runnable runnable = zzd4.zzb;
                zzd2 = zzd4.next;
                Runnable runnable2 = (Runnable) Objects.requireNonNull(runnable);
                if (runnable2 instanceof zzb) {
                    zzb zzb2 = (zzb) runnable2;
                    zzgcb = zzb2.zza;
                    if (zzgcb.valueField == zzb2 && zzv(zzgcb, zzb2, zze(zzb2.zzb))) {
                        z = false;
                    }
                } else {
                    zzy(runnable2, (Executor) Objects.requireNonNull(zzd4.zzc));
                }
                zzd4 = zzd2;
            }
            return;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger zza2 = zzf.zza();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            zza2.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, e);
        }
    }

    public void addListener(Runnable runnable, Executor executor) {
        zzd zzd2;
        zzfvp.zzc(runnable, "Runnable was null.");
        zzfvp.zzc(executor, "Executor was null.");
        if (isDone() || (zzd2 = this.listenersField) == zzd.zza) {
            zzy(runnable, executor);
        }
        zzd zzd3 = new zzd(runnable, executor);
        do {
            zzd3.next = zzd2;
            if (!zzu(zzd2, zzd3)) {
                zzd2 = this.listenersField;
            } else {
                return;
            }
        } while (zzd2 != zzd.zza);
        zzy(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.ListenableFuture<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.valueField
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzgcb.zzb
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x000a
            r4 = r3
            goto L_0x000b
        L_0x000a:
            r4 = r2
        L_0x000b:
            r1 = r1 | r4
            if (r1 == 0) goto L_0x0060
            boolean r1 = zzg
            if (r1 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzgcb$zza r1 = new com.google.android.gms.internal.ads.zzgcb$zza
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L_0x002a
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzgcb$zza r1 = com.google.android.gms.internal.ads.zzgcb.zza.zza
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.zzgcb$zza r1 = com.google.android.gms.internal.ads.zzgcb.zza.zzb
        L_0x0026:
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
        L_0x002a:
            r4 = r7
            r5 = r2
        L_0x002c:
            boolean r6 = zzv(r4, r0, r1)
            if (r6 == 0) goto L_0x0057
            zzx(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgcb.zzb
            if (r4 == 0) goto L_0x0055
            com.google.android.gms.internal.ads.zzgcb$zzb r0 = (com.google.android.gms.internal.ads.zzgcb.zzb) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgcb.zze
            if (r4 == 0) goto L_0x0052
            r4 = r0
            com.google.android.gms.internal.ads.zzgcb r4 = (com.google.android.gms.internal.ads.zzgcb) r4
            java.lang.Object r0 = r4.valueField
            if (r0 != 0) goto L_0x004a
            r5 = r3
            goto L_0x004b
        L_0x004a:
            r5 = r2
        L_0x004b:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzgcb.zzb
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0055
            r5 = r3
            goto L_0x002c
        L_0x0052:
            r0.cancel(r8)
        L_0x0055:
            r2 = r3
            goto L_0x0060
        L_0x0057:
            java.lang.Object r0 = r4.valueField
            boolean r6 = zzm(r0)
            if (r6 == 0) goto L_0x002c
            r2 = r5
        L_0x0060:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcb.cancel(boolean):boolean");
    }

    public Object get() throws InterruptedException, ExecutionException {
        return zzq();
    }

    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzm(obj);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzw(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                ListenableFuture<? extends V> listenableFuture = ((zzb) obj).zzb;
                if (listenableFuture == this) {
                    try {
                        sb.append("this future");
                    } catch (Throwable th) {
                        zzgeg.zzb(th);
                        sb.append("Exception thrown from implementation: ");
                        sb.append(th.getClass());
                    }
                } else {
                    sb.append(listenableFuture);
                }
                sb.append("]");
            } else {
                try {
                    str = zzfwg.zza(zza());
                } catch (Throwable th2) {
                    zzgeg.zzb(th2);
                    str = "Exception thrown from implementation: ".concat(String.valueOf(String.valueOf(th2.getClass())));
                }
                if (str != null) {
                    sb.append(", info=[");
                    sb.append(str);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzw(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String zza() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        return "remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    public void zzb() {
    }

    /* access modifiers changed from: protected */
    public boolean zzc(Object obj) {
        if (obj == null) {
            obj = zze;
        }
        if (!zzv(this, (Object) null, obj)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean zzd(Throwable th) {
        th.getClass();
        Throwable th2 = th;
        if (!zzv(this, (Object) null, new zzc(th))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    /* access modifiers changed from: protected */
    public final Throwable zzi() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzc;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void zzk() {
    }

    /* access modifiers changed from: package-private */
    public final void zzl(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzo());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzo() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return zzr(j, timeUnit);
    }

    /* access modifiers changed from: protected */
    public final boolean zzn(ListenableFuture listenableFuture) {
        zzc zzc2;
        listenableFuture.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (!listenableFuture.isDone()) {
                zzb zzb2 = new zzb(this, listenableFuture);
                if (zzv(this, (Object) null, zzb2)) {
                    try {
                        listenableFuture.addListener(zzb2, zzgdb.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            zzc2 = new zzc(th);
                        } catch (Error | Exception unused) {
                            zzc2 = zzc.zza;
                        }
                        zzv(this, zzb2, zzc2);
                    }
                    return true;
                }
                obj = this.valueField;
            } else if (!zzv(this, (Object) null, zze(listenableFuture))) {
                return false;
            } else {
                zzx(this, false);
                return true;
            }
        }
        if (obj instanceof zza) {
            listenableFuture.cancel(((zza) obj).zzc);
        }
        return false;
    }
}
