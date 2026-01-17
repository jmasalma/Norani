package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzabo implements zzcb {
    private final Context zza;
    private final zzca zzb;
    private final SparseArray zzc;
    /* access modifiers changed from: private */
    public final boolean zzd;
    private final zzaco zze;
    private final zzdj zzf;
    private final CopyOnWriteArraySet zzg;
    /* access modifiers changed from: private */
    public zzet zzh = new zzet(10);
    private final zzz zzi;
    private final zzbv zzj;
    private final zzfyq zzk;
    private zzdt zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    /* access modifiers changed from: private */
    public long zzp;
    /* access modifiers changed from: private */
    public long zzq;
    private int zzr;

    /* synthetic */ zzabo(zzabh zzabh, zzabn zzabn) {
        this.zza = zzabh.zza;
        zzca zzb2 = zzabh.zzc;
        zzdd.zzb(zzb2);
        zzca zzca = zzb2;
        this.zzb = zzb2;
        this.zzc = new SparseArray();
        this.zzk = zzfyq.zzn();
        this.zzj = zzbv.zza;
        this.zzd = zzabh.zzd;
        zzdj zzc2 = zzabh.zze;
        this.zzf = zzc2;
        this.zze = new zzaar(zzabh.zzb, zzc2);
        new zzabg(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzi = new zzx().zzan();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }

    /* access modifiers changed from: private */
    public static final zzk zzA(zzk zzk2) {
        return (zzk2 == null || !zzk2.zzf()) ? zzk.zza : zzk2;
    }

    public static /* synthetic */ void zzf(zzabo zzabo) {
        zzabo.zzn--;
    }

    static /* bridge */ /* synthetic */ void zzj(zzabo zzabo, boolean z) {
        if (zzabo.zzo == 1) {
            zzabo.zzn++;
            zzaco zzaco = zzabo.zze;
            zzaco.zzj(z);
            while (zzabo.zzh.zza() > 1) {
                zzabo.zzh.zzb();
            }
            if (zzabo.zzh.zza() == 1) {
                zzabm zzabm = (zzabm) zzabo.zzh.zzb();
                zzabm.getClass();
                zzabm zzabm2 = zzabm;
                zzaco.zzl(1, zzabo.zzi, zzabm.zza, zzabm.zzb, zzfyq.zzn());
            }
            zzabo.zzp = -9223372036854775807L;
            zzabo.zzq = -9223372036854775807L;
            zzdt zzdt = zzabo.zzl;
            zzdd.zzb(zzdt);
            zzdt zzdt2 = zzdt;
            zzdt.zzi(new zzabe(zzabo));
        }
    }

    static /* bridge */ /* synthetic */ boolean zzy(zzabo zzabo, zzz zzz, int i) {
        zzdd.zzf(zzabo.zzo == 0);
        zzk zzA = zzA(zzz.zzE);
        int i2 = zzA.zzd;
        if (i2 == 7) {
            if (Build.VERSION.SDK_INT >= 34 || !zzdr.zzb()) {
                i2 = 7;
            } else {
                zzi zzc2 = zzA.zzc();
                zzc2.zzd(6);
                zzA = zzc2.zzg();
                zzk zzk2 = zzA;
                zzdj zzdj = zzabo.zzf;
                Looper myLooper = Looper.myLooper();
                zzdd.zzb(myLooper);
                Looper looper = myLooper;
                zzabo.zzl = zzdj.zzd(myLooper, (Handler.Callback) null);
                zzca zzca = zzabo.zzb;
                Context context = zzabo.zza;
                zzn zzn2 = zzn.zza;
                zzdt zzdt = zzabo.zzl;
                Objects.requireNonNull(zzdt);
                zzca.zza(context, zzk2, zzn2, zzabo, new zzabf(zzdt), zzabo.zzj, zzabo.zzk, 0, false);
                throw null;
            }
        }
        if (!zzdr.zzc(i2) && Build.VERSION.SDK_INT >= 29) {
            String str = zzex.zza;
            zzea.zzf("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", new Object[]{Integer.valueOf(i2)}));
            zzA = zzk.zza;
        }
        zzk zzk22 = zzA;
        zzdj zzdj2 = zzabo.zzf;
        Looper myLooper2 = Looper.myLooper();
        zzdd.zzb(myLooper2);
        Looper looper2 = myLooper2;
        zzabo.zzl = zzdj2.zzd(myLooper2, (Handler.Callback) null);
        try {
            zzca zzca2 = zzabo.zzb;
            Context context2 = zzabo.zza;
            zzn zzn22 = zzn.zza;
            zzdt zzdt2 = zzabo.zzl;
            Objects.requireNonNull(zzdt2);
            zzca2.zza(context2, zzk22, zzn22, zzabo, new zzabf(zzdt2), zzabo.zzj, zzabo.zzk, 0, false);
            throw null;
        } catch (zzbw e) {
            throw new zzacn(e, zzz);
        }
    }

    static /* bridge */ /* synthetic */ boolean zzz(zzabo zzabo) {
        int i = zzabo.zzr;
        return i != -1 && i == 0;
    }

    public final zzaco zze(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzex.zzH(sparseArray, 0)) {
            return (zzaco) sparseArray.get(0);
        }
        zzabi zzabi = new zzabi(this, this.zza, 0);
        this.zzg.add(zzabi);
        sparseArray.put(0, zzabi);
        return zzabi;
    }

    public final void zzq() {
        zzeo zzeo = zzeo.zza;
        zzeo.zzb();
        zzeo.zza();
        this.zzm = null;
    }

    public final void zzr() {
        if (this.zzo != 2) {
            zzdt zzdt = this.zzl;
            if (zzdt != null) {
                zzdt.zzf((Object) null);
            }
            this.zzm = null;
            this.zzo = 2;
        }
    }

    public final void zzs(Surface surface, zzeo zzeo) {
        Pair pair = this.zzm;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((zzeo) this.zzm.second).equals(zzeo)) {
            this.zzm = Pair.create(surface, zzeo);
            zzeo.zzb();
            zzeo.zza();
        }
    }

    public final void zzt(int i) {
        this.zzr = 1;
    }

    public final void zzu() {
        this.zze.zzx();
    }

    public final void zzv() {
        this.zze.zzy();
    }
}
