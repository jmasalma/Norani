package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcj;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzij implements zzkx {
    private final zzzm zza;
    private final long zzb = zzex.zzs(50000);
    private final long zzc = zzex.zzs(50000);
    private final long zzd = zzex.zzs(1000);
    private final long zze = zzex.zzs(2000);
    private final long zzf = zzex.zzs(0);
    private final HashMap zzg = new HashMap();
    private long zzh = -1;

    public zzij() {
        zzzm zzzm = new zzzm(true, 65536);
        zzl(zzbcj.zzq.zzf, 0, "bufferForPlaybackMs", "0");
        zzl(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzl(50000, zzbcj.zzq.zzf, "minBufferMs", "bufferForPlaybackMs");
        zzl(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzl(50000, 50000, "maxBufferMs", "minBufferMs");
        zzl(0, 0, "backBufferDurationMs", "0");
        this.zza = zzzm;
    }

    private static void zzl(int i, int i2, String str, String str2) {
        zzdd.zze(i >= i2, str + " cannot be less than " + str2);
    }

    private final void zzm(zzph zzph) {
        if (this.zzg.remove(zzph) != null) {
            zzn();
        }
    }

    private final void zzn() {
        if (this.zzg.isEmpty()) {
            this.zza.zze();
        } else {
            this.zza.zzf(zza());
        }
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        int i = 0;
        for (zzih zzih : this.zzg.values()) {
            i += zzih.zzb;
        }
        return i;
    }

    public final long zzb(zzph zzph) {
        return this.zzf;
    }

    public final void zzc(zzph zzph) {
        long id = Thread.currentThread().getId();
        long j = this.zzh;
        boolean z = true;
        if (!(j == -1 || j == id)) {
            z = false;
        }
        zzdd.zzg(z, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = id;
        HashMap hashMap = this.zzg;
        if (!hashMap.containsKey(zzph)) {
            hashMap.put(zzph, new zzih((zzii) null));
        }
        zzih zzih = (zzih) hashMap.get(zzph);
        zzih.getClass();
        zzih zzih2 = zzih;
        zzih.zzb = 13107200;
        zzih.zza = false;
    }

    public final void zzd(zzph zzph) {
        zzm(zzph);
        if (this.zzg.isEmpty()) {
            this.zzh = -1;
        }
    }

    public final void zze(zzph zzph) {
        zzm(zzph);
    }

    public final void zzf(zzkw zzkw, zzxk zzxk, zzyw[] zzywArr) {
        zzih zzih = (zzih) this.zzg.get(zzkw.zza);
        zzih.getClass();
        zzih zzih2 = zzih;
        int length = zzywArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i < length) {
                zzyw zzyw = zzywArr[i];
                if (zzyw != null) {
                    switch (zzyw.zzc().zzc) {
                        case -1:
                        case 1:
                            break;
                        case 0:
                            i3 = 144310272;
                            break;
                        case 2:
                            i3 = 131072000;
                            break;
                        case 4:
                            i3 = 26214400;
                            break;
                        default:
                            i3 = 131072;
                            break;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                zzih.zzb = Math.max(13107200, i2);
                zzn();
                return;
            }
        }
    }

    public final boolean zzg(zzph zzph) {
        return false;
    }

    public final boolean zzh(zzkw zzkw) {
        zzih zzih = (zzih) this.zzg.get(zzkw.zza);
        zzih.getClass();
        zzih zzih2 = zzih;
        int zza2 = this.zza.zza();
        int zza3 = zza();
        long j = this.zzb;
        float f = zzkw.zzc;
        if (f > 1.0f) {
            j = Math.min(zzex.zzq(j, f), this.zzc);
        }
        long j2 = zzkw.zzb;
        int i = (j2 > Math.max(j, 500000) ? 1 : (j2 == Math.max(j, 500000) ? 0 : -1));
        boolean z = false;
        if (i < 0) {
            if (zza2 < zza3) {
                z = true;
            }
            zzih.zza = z;
            if (!z && j2 < 500000) {
                zzea.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.zzc || zza2 >= zza3) {
            zzih.zza = false;
        }
        return zzih.zza;
    }

    public final boolean zzi(zzbl zzbl, zzvh zzvh, long j) {
        for (zzih zzih : this.zzg.values()) {
            if (zzih.zza) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzj(zzkw zzkw) {
        long j;
        boolean z = zzkw.zzd;
        long zzr = zzex.zzr(zzkw.zzb, zzkw.zzc);
        if (z) {
            j = this.zze;
        } else {
            j = this.zzd;
        }
        long j2 = zzkw.zze;
        if (j2 != -9223372036854775807L) {
            j = Math.min(j2 / 2, j);
        }
        return j <= 0 || zzr >= j || this.zza.zza() >= zza();
    }

    public final zzzm zzk() {
        return this.zza;
    }
}
