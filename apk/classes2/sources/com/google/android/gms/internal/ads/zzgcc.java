package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcb;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
abstract class zzgcc<V> extends zzger implements ListenableFuture<V> {
    private static final zza zzbi;
    static final Object zze = new Object();
    static final zzgdw zzf = new zzgdw(zzgcb.class);
    static final boolean zzg;
    volatile zzgcb.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    abstract class zza {
        /* synthetic */ zza(zzgcg zzgcg) {
        }

        /* access modifiers changed from: package-private */
        public abstract zzgcb.zzd zza(zzgcc zzgcc, zzgcb.zzd zzd);

        /* access modifiers changed from: package-private */
        public abstract zze zzb(zzgcc zzgcc, zze zze);

        /* access modifiers changed from: package-private */
        public abstract void zzc(zze zze, zze zze2);

        /* access modifiers changed from: package-private */
        public abstract void zzd(zze zze, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean zze(zzgcc zzgcc, zzgcb.zzd zzd, zzgcb.zzd zzd2);

        /* access modifiers changed from: package-private */
        public abstract boolean zzf(zzgcc zzgcc, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean zzg(zzgcc zzgcc, zze zze, zze zze2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzgcc<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzgcc.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzgcc<?>, zzgcb.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzgcc.class, zzgcb.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzgcc<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzgcc.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        /* synthetic */ zzb(zzgcg zzgcg) {
            super((zzgcg) null);
        }

        /* access modifiers changed from: package-private */
        public final zzgcb.zzd zza(zzgcc zzgcc, zzgcb.zzd zzd2) {
            return zzd.getAndSet(zzgcc, zzd2);
        }

        /* access modifiers changed from: package-private */
        public final zze zzb(zzgcc zzgcc, zze zze2) {
            return zzc.getAndSet(zzgcc, zze2);
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zze zze2, zze zze3) {
            zzb.lazySet(zze2, zze3);
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zze zze2, Thread thread) {
            zza.lazySet(zze2, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzgcc zzgcc, zzgcb.zzd zzd2, zzgcb.zzd zzd3) {
            return zzgcd.zza(zzd, zzgcc, zzd2, zzd3);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzgcc zzgcc, Object obj, Object obj2) {
            return zzgcd.zza(zze, zzgcc, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzgcc zzgcc, zze zze2, zze zze3) {
            return zzgcd.zza(zzc, zzgcc, zze2, zze3);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        /* synthetic */ zzc(zzgcg zzgcg) {
            super((zzgcg) null);
        }

        /* access modifiers changed from: package-private */
        public final zzgcb.zzd zza(zzgcc zzgcc, zzgcb.zzd zzd) {
            zzgcb.zzd zzd2;
            synchronized (zzgcc) {
                zzd2 = zzgcc.listenersField;
                if (zzd2 != zzd) {
                    zzgcc.listenersField = zzd;
                }
            }
            return zzd2;
        }

        /* access modifiers changed from: package-private */
        public final zze zzb(zzgcc zzgcc, zze zze) {
            zze zze2;
            synchronized (zzgcc) {
                zze2 = zzgcc.waitersField;
                if (zze2 != zze) {
                    zzgcc.waitersField = zze;
                }
            }
            return zze2;
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zze zze, zze zze2) {
            zze.next = zze2;
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zze zze, Thread thread) {
            zze.thread = thread;
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzgcc zzgcc, zzgcb.zzd zzd, zzgcb.zzd zzd2) {
            synchronized (zzgcc) {
                if (zzgcc.listenersField != zzd) {
                    return false;
                }
                zzgcc.listenersField = zzd2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzgcc zzgcc, Object obj, Object obj2) {
            synchronized (zzgcc) {
                if (zzgcc.valueField != obj) {
                    return false;
                }
                zzgcc.valueField = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzgcc zzgcc, zze zze, zze zze2) {
            synchronized (zzgcc) {
                if (zzgcc.waitersField != zze) {
                    return false;
                }
                zzgcc.waitersField = zze2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;
        public static final /* synthetic */ int zzg = 0;

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
            r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.zzgcf());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                goto L_0x0010
            L_0x0005:
                com.google.android.gms.internal.ads.zzgcf r0 = new com.google.android.gms.internal.ads.zzgcf     // Catch:{ PrivilegedActionException -> 0x005c }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x005c }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x005c }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x005c }
            L_0x0010:
                java.lang.Class<com.google.android.gms.internal.ads.zzgcc> r1 = com.google.android.gms.internal.ads.zzgcc.class
                java.lang.String r2 = "waitersField"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0055 }
                zzc = r2     // Catch:{ NoSuchFieldException -> 0x0055 }
                java.lang.String r2 = "listenersField"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ NoSuchFieldException -> 0x0055 }
                zzb = r2     // Catch:{ NoSuchFieldException -> 0x0055 }
                java.lang.String r2 = "valueField"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0055 }
                zzd = r1     // Catch:{ NoSuchFieldException -> 0x0055 }
                java.lang.Class<com.google.android.gms.internal.ads.zzgcc$zze> r1 = com.google.android.gms.internal.ads.zzgcc.zze.class
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0055 }
                zze = r1     // Catch:{ NoSuchFieldException -> 0x0055 }
                java.lang.Class<com.google.android.gms.internal.ads.zzgcc$zze> r1 = com.google.android.gms.internal.ads.zzgcc.zze.class
                java.lang.String r2 = "next"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ NoSuchFieldException -> 0x0055 }
                zzf = r1     // Catch:{ NoSuchFieldException -> 0x0055 }
                zza = r0     // Catch:{ NoSuchFieldException -> 0x0055 }
                return
            L_0x0055:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005c:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Could not initialize intrinsics"
                java.lang.Throwable r0 = r0.getCause()
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcc.zzd.<clinit>():void");
        }

        private zzd() {
            throw null;
        }

        /* synthetic */ zzd(zzgcg zzgcg) {
            super((zzgcg) null);
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        final com.google.android.gms.internal.ads.zzgcb.zzd zza(com.google.android.gms.internal.ads.zzgcc r3, com.google.android.gms.internal.ads.zzgcb.zzd r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzgcb$zzd r0 = r3.listenersField
                if (r4 != r0) goto L_0x0005
                goto L_0x000b
            L_0x0005:
                boolean r1 = r2.zze(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
            L_0x000b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcc.zzd.zza(com.google.android.gms.internal.ads.zzgcc, com.google.android.gms.internal.ads.zzgcb$zzd):com.google.android.gms.internal.ads.zzgcb$zzd");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        final com.google.android.gms.internal.ads.zzgcc.zze zzb(com.google.android.gms.internal.ads.zzgcc r3, com.google.android.gms.internal.ads.zzgcc.zze r4) {
            /*
                r2 = this;
            L_0x0000:
                com.google.android.gms.internal.ads.zzgcc$zze r0 = r3.waitersField
                if (r4 != r0) goto L_0x0005
                goto L_0x000b
            L_0x0005:
                boolean r1 = r2.zzg(r3, r0, r4)
                if (r1 == 0) goto L_0x0000
            L_0x000b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgcc.zzd.zzb(com.google.android.gms.internal.ads.zzgcc, com.google.android.gms.internal.ads.zzgcc$zze):com.google.android.gms.internal.ads.zzgcc$zze");
        }

        /* access modifiers changed from: package-private */
        public final void zzc(zze zze2, zze zze3) {
            zza.putObject(zze2, zzf, zze3);
        }

        /* access modifiers changed from: package-private */
        public final void zzd(zze zze2, Thread thread) {
            zza.putObject(zze2, zze, thread);
        }

        /* access modifiers changed from: package-private */
        public final boolean zze(zzgcc zzgcc, zzgcb.zzd zzd2, zzgcb.zzd zzd3) {
            return zzgce.zza(zza, zzgcc, zzb, zzd2, zzd3);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzf(zzgcc zzgcc, Object obj, Object obj2) {
            return zzgce.zza(zza, zzgcc, zzd, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zzg(zzgcc zzgcc, zze zze2, zze zze3) {
            return zzgce.zza(zza, zzgcc, zzc, zze2, zze3);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        zze() {
            zzgcc.zzbi.zzd(this, Thread.currentThread());
        }

        zze(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zzb zzb2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzg = z;
        String property = System.getProperty("java.runtime.name", "");
        if (property == null || property.contains("Android")) {
            try {
                zzb2 = new zzd((zzgcg) null);
            } catch (Error | Exception e) {
                try {
                    th = e;
                    th2 = null;
                    zzb2 = new zzb((zzgcg) null);
                } catch (Error | Exception e2) {
                    th = e;
                    th2 = e2;
                    zzb2 = new zzc((zzgcg) null);
                }
            }
        } else {
            try {
                zzb2 = new zzb((zzgcg) null);
            } catch (NoClassDefFoundError unused2) {
                zzb2 = new zzc((zzgcg) null);
            }
        }
        th2 = null;
        th = null;
        zzbi = zzb2;
        if (th2 != null) {
            zzgdw zzgdw = zzf;
            zzgdw.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            zzgdw.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    zzgcc() {
    }

    private final void zza(zze zze2) {
        zze2.thread = null;
        while (true) {
            zze zze3 = this.waitersField;
            if (zze3 != zze.zza) {
                zze zze4 = null;
                while (zze3 != null) {
                    zze zze5 = zze3.next;
                    if (zze3.thread != null) {
                        zze4 = zze3;
                    } else if (zze4 != null) {
                        zze4.next = zze5;
                        if (zze4.thread == null) {
                        }
                    } else if (!zzbi.zzg(this, zze3, zze5)) {
                    }
                    zze3 = zze5;
                }
                return;
            }
            return;
        }
    }

    static boolean zzv(zzgcc zzgcc, Object obj, Object obj2) {
        return zzbi.zzf(zzgcc, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    public final zzgcb.zzd zzp(zzgcb.zzd zzd2) {
        return zzbi.zza(this, zzd2);
    }

    /* access modifiers changed from: package-private */
    public final Object zzq() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.valueField;
            if ((obj2 != null) && zzgcb.zzm(obj2)) {
                return zzgcb.zzh(obj2);
            }
            zze zze2 = this.waitersField;
            if (zze2 != zze.zza) {
                zze zze3 = new zze();
                do {
                    zza zza2 = zzbi;
                    zza2.zzc(zze3, zze2);
                    if (zza2.zzg(this, zze2, zze3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.valueField;
                            } else {
                                zza(zze3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & zzgcb.zzm(obj)));
                        return zzgcb.zzh(obj);
                    }
                    zze2 = this.waitersField;
                } while (zze2 != zze.zza);
            }
            return zzgcb.zzh(Objects.requireNonNull(this.valueField));
        }
        throw new InterruptedException();
    }

    /* access modifiers changed from: package-private */
    public final Object zzr(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.valueField;
            boolean z = true;
            if ((obj != null) && zzgcb.zzm(obj)) {
                return zzgcb.zzh(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                zze zze2 = this.waitersField;
                if (zze2 != zze.zza) {
                    zze zze3 = new zze();
                    do {
                        zza zza2 = zzbi;
                        zza2.zzc(zze3, zze2);
                        if (zza2.zzg(this, zze2, zze3)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.valueField;
                                    if ((obj2 != null) && zzgcb.zzm(obj2)) {
                                        return zzgcb.zzh(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zza(zze3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zza(zze3);
                        } else {
                            zze2 = this.waitersField;
                        }
                    } while (zze2 != zze.zza);
                }
                return zzgcb.zzh(Objects.requireNonNull(this.valueField));
            }
            while (nanos > 0) {
                Object obj3 = this.valueField;
                if ((obj3 != null) && zzgcb.zzm(obj3)) {
                    return zzgcb.zzh(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String obj4 = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + obj4);
        }
        throw new InterruptedException();
    }

    /* access modifiers changed from: package-private */
    public final void zzt() {
        for (zze zzb2 = zzbi.zzb(this, zze.zza); zzb2 != null; zzb2 = zzb2.next) {
            Thread thread = zzb2.thread;
            if (thread != null) {
                zzb2.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzu(zzgcb.zzd zzd2, zzgcb.zzd zzd3) {
        return zzbi.zze(this, zzd2, zzd3);
    }
}
