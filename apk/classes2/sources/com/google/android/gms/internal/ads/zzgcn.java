package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
abstract class zzgcn extends zzgcs {
    private static final zzgdw zza = new zzgdw(zzgcn.class);
    private zzfyl zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzgcn(zzfyl zzfyl, boolean z, boolean z2) {
        super(zzfyl.size());
        zzfyl.getClass();
        zzfyl zzfyl2 = zzfyl;
        this.zzb = zzfyl;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzD(int i, Future future) {
        try {
            zzx(i, zzgeq.zza(future));
        } catch (ExecutionException e) {
            zzF(e.getCause());
        } catch (Throwable th) {
            zzF(th);
        }
    }

    /* access modifiers changed from: private */
    public final void zzE(zzfyl zzfyl) {
        int zzB = zzB();
        int i = 0;
        zzfvp.zzm(zzB >= 0, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzfyl != null) {
                zzgaw zze = zzfyl.iterator();
                while (zze.hasNext()) {
                    Future future = (Future) zze.next();
                    if (!future.isCancelled()) {
                        zzD(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            zzy();
            zzA(2);
        }
    }

    private static void zzG(Throwable th) {
        String str;
        if (true != (th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    /* access modifiers changed from: private */
    public final void zzH(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzD(i, listenableFuture);
            }
        } finally {
            zzE((zzfyl) null);
        }
    }

    private static boolean zzI(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void zzA(int i) {
        this.zzb = null;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        zzfyl zzfyl = this.zzb;
        if (zzfyl != null) {
            return "futures=".concat(zzfyl.toString());
        }
        return super.zza();
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzfyl zzfyl = this.zzb;
        boolean z = true;
        zzA(1);
        boolean isCancelled = isCancelled();
        if (zzfyl == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean zzo = zzo();
            zzgaw zze = zzfyl.iterator();
            while (zze.hasNext()) {
                ((Future) zze.next()).cancel(zzo);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void zzx(int i, Object obj);

    /* access modifiers changed from: package-private */
    public abstract void zzy();

    /* access modifiers changed from: package-private */
    public final void zzz() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzy();
        } else if (this.zzc) {
            zzgaw zze = this.zzb.iterator();
            int i = 0;
            while (zze.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) zze.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    zzH(i, listenableFuture);
                } else {
                    listenableFuture.addListener(new zzgcl(this, i, listenableFuture), zzgdb.INSTANCE);
                }
                i = i2;
            }
        } else {
            zzfyl zzfyl = this.zzb;
            zzfyl zzfyl2 = true != this.zzd ? null : zzfyl;
            zzgcm zzgcm = new zzgcm(this, zzfyl2);
            zzgaw zze2 = zzfyl.iterator();
            while (zze2.hasNext()) {
                ListenableFuture listenableFuture2 = (ListenableFuture) zze2.next();
                if (listenableFuture2.isDone()) {
                    zzE(zzfyl2);
                } else {
                    listenableFuture2.addListener(zzgcm, zzgdb.INSTANCE);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzw(Set set) {
        set.getClass();
        if (!isCancelled()) {
            zzI(set, (Throwable) Objects.requireNonNull(zzi()));
        }
    }

    private final void zzF(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzI(zzC(), th)) {
            zzG(th);
        } else if (th instanceof Error) {
            zzG(th);
        }
    }
}
