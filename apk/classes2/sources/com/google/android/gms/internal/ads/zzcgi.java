package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzec;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcgi extends zzec {
    private final zzccb zza;
    private final Object zzb = new Object();
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private zzeg zzf;
    private boolean zzg;
    private boolean zzh = true;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbhx zzn;

    public zzcgi(zzccb zzccb, float f, boolean z, boolean z2) {
        this.zza = zzccb;
        this.zzi = f;
        this.zzc = z;
        this.zzd = z2;
    }

    public static /* synthetic */ void zzd(zzcgi zzcgi, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        int i3;
        boolean z4;
        zzeg zzeg;
        zzeg zzeg2;
        zzeg zzeg3;
        synchronized (zzcgi.zzb) {
            boolean z5 = zzcgi.zzg;
            boolean z6 = false;
            if (z5 || i2 != 1) {
                i3 = i2;
                z3 = false;
            } else {
                i2 = 1;
                i3 = 1;
                z3 = true;
            }
            boolean z7 = i != i2;
            if (!z7 || i3 != 1) {
                z4 = false;
            } else {
                z4 = true;
                i3 = 1;
            }
            boolean z8 = z7 && i3 == 2;
            boolean z9 = z7 && i3 == 3;
            if (z5 || z3) {
                z6 = true;
            }
            zzcgi.zzg = z6;
            if (z3) {
                try {
                    zzeg zzeg4 = zzcgi.zzf;
                    if (zzeg4 != null) {
                        zzeg4.zzi();
                    }
                } catch (RemoteException e) {
                    zzo.zzl("#007 Could not call remote method.", e);
                }
            }
            if (z4 && (zzeg3 = zzcgi.zzf) != null) {
                zzeg3.zzh();
            }
            if (z8 && (zzeg2 = zzcgi.zzf) != null) {
                zzeg2.zzg();
            }
            if (z9) {
                zzeg zzeg5 = zzcgi.zzf;
                if (zzeg5 != null) {
                    zzeg5.zze();
                }
                zzcgi.zza.zzw();
            }
            if (!(z == z2 || (zzeg = zzcgi.zzf) == null)) {
                zzeg.zzf(z2);
            }
        }
    }

    private final void zzw(int i, int i2, boolean z, boolean z2) {
        zzcaf.zzf.execute(new zzcgh(this, i, i2, z, z2));
    }

    private final void zzx(String str, Map map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzcaf.zzf.execute(new zzcgg(this, hashMap));
    }

    public final float zze() {
        float f;
        synchronized (this.zzb) {
            f = this.zzk;
        }
        return f;
    }

    public final float zzf() {
        float f;
        synchronized (this.zzb) {
            f = this.zzj;
        }
        return f;
    }

    public final float zzg() {
        float f;
        synchronized (this.zzb) {
            f = this.zzi;
        }
        return f;
    }

    public final int zzh() {
        int i;
        synchronized (this.zzb) {
            i = this.zze;
        }
        return i;
    }

    public final zzeg zzi() throws RemoteException {
        zzeg zzeg;
        synchronized (this.zzb) {
            zzeg = this.zzf;
        }
        return zzeg;
    }

    public final void zzj(boolean z) {
        zzx(true != z ? "unmute" : "mute", (Map) null);
    }

    public final void zzk() {
        zzx("pause", (Map) null);
    }

    public final void zzl() {
        zzx("play", (Map) null);
    }

    public final void zzm(zzeg zzeg) {
        synchronized (this.zzb) {
            this.zzf = zzeg;
        }
    }

    public final void zzn() {
        zzx("stop", (Map) null);
    }

    public final boolean zzo() {
        boolean z;
        Object obj = this.zzb;
        boolean zzp = zzp();
        synchronized (obj) {
            z = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    public final boolean zzp() {
        boolean z;
        synchronized (this.zzb) {
            z = false;
            if (this.zzc && this.zzl) {
                z = true;
            }
        }
        return z;
    }

    public final boolean zzq() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzh;
        }
        return z;
    }

    public final void zzr(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.zzb) {
            z2 = true;
            if (f2 == this.zzi) {
                if (f3 == this.zzk) {
                    z2 = false;
                }
            }
            this.zzi = f2;
            if (!((Boolean) zzbd.zzc().zzb(zzbde.zzni)).booleanValue()) {
                this.zzj = f;
            }
            z3 = this.zzh;
            this.zzh = z;
            i2 = this.zze;
            this.zze = i;
            float f4 = this.zzk;
            this.zzk = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.zza.zzF().invalidate();
            }
        }
        if (z2) {
            try {
                zzbhx zzbhx = this.zzn;
                if (zzbhx != null) {
                    zzbhx.zze();
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        zzw(i2, i, z3, z);
    }

    public final void zzs(zzgc zzgc) {
        String str;
        String str2;
        String str3;
        Object obj = this.zzb;
        boolean z = zzgc.zzb;
        boolean z2 = zzgc.zzc;
        synchronized (obj) {
            this.zzl = z;
            this.zzm = z2;
        }
        boolean z3 = zzgc.zza;
        if (true != z) {
            str = "0";
        } else {
            str = "1";
        }
        String str4 = str;
        if (true != z2) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        String str5 = str2;
        if (true != z3) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", str3, "customControlsRequested", str4, "clickToExpandRequested", str5));
    }

    public final void zzt(float f) {
        synchronized (this.zzb) {
            this.zzj = f;
        }
    }

    public final void zzu() {
        boolean z;
        int i;
        synchronized (this.zzb) {
            z = this.zzh;
            i = this.zze;
            this.zze = 3;
        }
        zzw(i, 3, z, z);
    }

    public final void zzv(zzbhx zzbhx) {
        synchronized (this.zzb) {
            this.zzn = zzbhx;
        }
    }
}
