package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzavm;
import com.google.android.gms.internal.ads.zzavp;
import com.google.android.gms.internal.ads.zzavr;
import com.google.android.gms.internal.ads.zzavt;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfqc;
import com.google.android.gms.internal.ads.zzgdn;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzk implements Runnable, zzavp {
    private static final long zzc = System.currentTimeMillis();
    protected boolean zza;
    final CountDownLatch zzb = new CountDownLatch(1);
    private final List zzd = new Vector();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final boolean zzg;
    private final boolean zzh;
    private final Executor zzi;
    /* access modifiers changed from: private */
    public final zzfoi zzj;
    private Context zzk;
    private final Context zzl;
    private VersionInfoParcel zzm;
    private final VersionInfoParcel zzn;
    private final boolean zzo;
    private int zzp;

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzk = context;
        this.zzl = context;
        this.zzm = versionInfoParcel;
        this.zzn = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzi = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzbd.zzc().zzb(zzbde.zzcH)).booleanValue();
        this.zzo = booleanValue;
        this.zzj = zzfoi.zza(context, newCachedThreadPool, booleanValue);
        this.zzg = ((Boolean) zzbd.zzc().zzb(zzbde.zzcE)).booleanValue();
        this.zzh = ((Boolean) zzbd.zzc().zzb(zzbde.zzcI)).booleanValue();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcG)).booleanValue()) {
            this.zzp = 2;
        } else {
            this.zzp = 1;
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzdK)).booleanValue()) {
            this.zza = zzi();
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdE)).booleanValue()) {
            zzcaf.zza.execute(this);
            return;
        }
        zzbb.zzb();
        if (zzf.zzz()) {
            zzcaf.zza.execute(this);
        } else {
            run();
        }
    }

    public static /* synthetic */ void zzc(zzk zzk2, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzu(zzk2.zzl, zzk2.zzn, z, zzk2.zzo).zzp();
        } catch (NullPointerException e) {
            zzk2.zzj.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    private final zzavp zzq() {
        if (zzm() == 2) {
            return (zzavp) this.zzf.get();
        }
        return (zzavp) this.zze.get();
    }

    private final void zzr() {
        List<Object[]> list = this.zzd;
        zzavp zzq = zzq();
        if (!list.isEmpty() && zzq != null) {
            for (Object[] objArr : list) {
                int length = objArr.length;
                if (length == 1) {
                    zzq.zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzq.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            list.clear();
        }
    }

    private final void zzs(boolean z) {
        String str = this.zzm.afmaVersion;
        Context zzt = zzt(this.zzk);
        zzarv zza2 = zzarx.zza();
        zza2.zza(z);
        zza2.zzb(str);
        int i = zzavt.zzw;
        this.zze.set(zzavt.zzt(zzt, new zzavr(zza2.zzbn())));
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final zzavm zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        zzarv zza2 = zzarx.zza();
        zza2.zza(z);
        zza2.zzb(versionInfoParcel.afmaVersion);
        return zzavm.zza(zzt(context), zza2.zzbn(), z2);
    }

    public final void run() {
        boolean z;
        long currentTimeMillis;
        try {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzdK)).booleanValue()) {
                this.zza = zzi();
            }
            boolean z2 = this.zzm.isClientJar;
            z = false;
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzbj)).booleanValue() && z2) {
                z = true;
            }
            if (zzm() == 1) {
                zzs(z);
                if (this.zzp == 2) {
                    this.zzi.execute(new zzi(this, z));
                }
            } else {
                currentTimeMillis = System.currentTimeMillis();
                zzavm zzu = zzu(this.zzk, this.zzm, z, this.zzo);
                this.zzf.set(zzu);
                if (this.zzh && !zzu.zzr()) {
                    this.zzp = 1;
                    zzs(z);
                }
            }
        } catch (NullPointerException e) {
            this.zzp = 1;
            zzs(z);
            this.zzj.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e);
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
            throw th;
        }
        this.zzb.countDown();
        this.zzk = null;
        this.zzm = null;
    }

    public final String zzb(Context context, byte[] bArr) {
        zzavp zzq;
        if (!zzj() || (zzq = zzq()) == null) {
            return "";
        }
        zzr();
        return zzq.zzf(zzt(context));
    }

    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, (Activity) null);
    }

    public final String zze(Context context, String str, View view, Activity activity) {
        if (!zzj()) {
            return "";
        }
        zzavp zzq = zzq();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzld)).booleanValue()) {
            zzv.zzr();
            zzs.zzK(view, 4, (MotionEvent) null);
        }
        if (zzq == null) {
            return "";
        }
        zzr();
        return zzq.zze(zzt(context), str, view, activity);
    }

    public final String zzf(Context context) {
        return zzb(context, (byte[]) null);
    }

    public final String zzg(Context context) {
        try {
            return (String) zzgdn.zzj(new zzh(this, context), this.zzi).get((long) ((Integer) zzbd.zzc().zzb(zzbde.zzcY)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzavi.zza(context, this.zzn.afmaVersion, zzc, true);
        }
    }

    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlc)).booleanValue()) {
            zzavp zzq = zzq();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzld)).booleanValue()) {
                zzv.zzr();
                zzs.zzK(view, 2, (MotionEvent) null);
            }
            if (zzq != null) {
                return zzq.zzh(context, view, activity);
            }
            return "";
        } else if (!zzj()) {
            return "";
        } else {
            zzavp zzq2 = zzq();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzld)).booleanValue()) {
                zzv.zzr();
                zzs.zzK(view, 2, (MotionEvent) null);
            }
            return zzq2 != null ? zzq2.zzh(context, view, activity) : "";
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzi() {
        Context context = this.zzk;
        zzj zzj2 = new zzj(this);
        zzfoi zzfoi = this.zzj;
        return new zzfqc(this.zzk, zzfpi.zzb(context, zzfoi), zzj2, ((Boolean) zzbd.zzc().zzb(zzbde.zzcF)).booleanValue()).zzd(1);
    }

    public final boolean zzj() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            int i = zze.zza;
            zzo.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final void zzk(MotionEvent motionEvent) {
        zzavp zzq = zzq();
        if (zzq != null) {
            zzr();
            zzq.zzk(motionEvent);
            return;
        }
        this.zzd.add(new Object[]{motionEvent});
    }

    public final void zzl(int i, int i2, int i3) {
        zzavp zzq = zzq();
        if (zzq != null) {
            zzr();
            zzq.zzl(i, i2, i3);
            return;
        }
        this.zzd.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* access modifiers changed from: protected */
    public final int zzm() {
        if (!this.zzg || this.zza) {
            return this.zzp;
        }
        return 1;
    }

    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavp zzq;
        zzavp zzq2;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzde)).booleanValue()) {
            if (this.zzb.getCount() == 0 && (zzq2 = zzq()) != null) {
                zzq2.zzn(stackTraceElementArr);
            }
        } else if (zzj() && (zzq = zzq()) != null) {
            zzq.zzn(stackTraceElementArr);
        }
    }

    public final void zzo(View view) {
        zzavp zzq = zzq();
        if (zzq != null) {
            zzq.zzo(view);
        }
    }

    public final int zzp() {
        return this.zzp;
    }
}
