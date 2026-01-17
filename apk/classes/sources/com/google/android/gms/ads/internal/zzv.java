package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zza;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzbt;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzazx;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbdk;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcal;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcdg;
import com.google.android.gms.internal.ads.zzcft;
import com.google.android.gms.internal.ads.zzedb;
import com.google.android.gms.internal.ads.zzedc;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzv {
    private static final zzv zza = new zzv();
    private final zzbbz zzA;
    private final zzbyo zzB;
    private final zzci zzC;
    private final zzcdg zzD;
    private final zzcas zzE;
    private final zza zzb;
    private final zzn zzc;
    private final zzs zzd;
    private final zzcft zze;
    private final zzbzz zzf;
    private final zzaa zzg;
    private final zzazx zzh;
    private final zzbzs zzi;
    private final zzab zzj;
    private final zzbbk zzk;
    private final Clock zzl;
    private final zzf zzm;
    private final zzbdk zzn;
    private final zzbed zzo;
    private final zzay zzp;
    private final zzbvx zzq;
    private final zzcal zzr;
    private final zzbon zzs;
    private final zzz zzt;
    private final zzbt zzu;
    private final zzae zzv;
    private final zzaf zzw;
    private final zzbpl zzx;
    private final zzbu zzy;
    private final zzedc zzz;

    protected zzv() {
        zzaa zzaa;
        zza zza2 = new zza();
        zzn zzn2 = new zzn();
        zzs zzs2 = new zzs();
        zzcft zzcft = new zzcft();
        zzbzz zzbzz = new zzbzz();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            zzaa = new zzy();
        } else {
            zzaa = i >= 28 ? new zzx() : new com.google.android.gms.ads.internal.util.zzv();
        }
        zzazx zzazx = new zzazx();
        zzbzs zzbzs = new zzbzs();
        zzab zzab = new zzab();
        zzbbk zzbbk = new zzbbk();
        Clock instance = DefaultClock.getInstance();
        zzf zzf2 = new zzf();
        zzbdk zzbdk = new zzbdk();
        zzbed zzbed = new zzbed();
        zzay zzay = new zzay();
        zzbvx zzbvx = new zzbvx();
        zzcal zzcal = new zzcal();
        zzbon zzbon = new zzbon();
        zzz zzz2 = new zzz();
        zzbt zzbt = new zzbt();
        zzae zzae = new zzae();
        zzaf zzaf = new zzaf();
        zzbpl zzbpl = new zzbpl();
        zzbu zzbu = new zzbu();
        zzedc zzedb = new zzedb();
        zzbbz zzbbz = new zzbbz();
        zzbyo zzbyo = new zzbyo();
        zzci zzci = new zzci();
        zzcdg zzcdg = new zzcdg();
        zzcas zzcas = new zzcas();
        this.zzb = zza2;
        this.zzc = zzn2;
        this.zzd = zzs2;
        this.zze = zzcft;
        this.zzf = zzbzz;
        this.zzg = zzaa;
        this.zzh = zzazx;
        this.zzi = zzbzs;
        this.zzj = zzab;
        this.zzk = zzbbk;
        this.zzl = instance;
        this.zzm = zzf2;
        this.zzn = zzbdk;
        this.zzo = zzbed;
        this.zzp = zzay;
        this.zzq = zzbvx;
        this.zzr = zzcal;
        this.zzs = zzbon;
        this.zzu = zzbt;
        this.zzt = zzz2;
        this.zzv = zzae;
        this.zzw = zzaf;
        this.zzx = zzbpl;
        this.zzy = zzbu;
        this.zzz = zzedb;
        this.zzA = zzbbz;
        this.zzB = zzbyo;
        this.zzC = zzci;
        this.zzD = zzcdg;
        this.zzE = zzcas;
    }

    public static zzcdg zzA() {
        return zza.zzD;
    }

    public static zzcft zzB() {
        return zza.zze;
    }

    public static zzedc zzC() {
        return zza.zzz;
    }

    public static Clock zzD() {
        return zza.zzl;
    }

    public static zzf zza() {
        return zza.zzm;
    }

    public static zzazx zzb() {
        return zza.zzh;
    }

    public static zzbbk zzc() {
        return zza.zzk;
    }

    public static zzbbz zzd() {
        return zza.zzA;
    }

    public static zzbdk zze() {
        return zza.zzn;
    }

    public static zzbed zzf() {
        return zza.zzo;
    }

    public static zzbon zzg() {
        return zza.zzs;
    }

    public static zzbpl zzh() {
        return zza.zzx;
    }

    public static zza zzi() {
        return zza.zzb;
    }

    public static zzn zzj() {
        return zza.zzc;
    }

    public static zzz zzk() {
        return zza.zzt;
    }

    public static zzae zzl() {
        return zza.zzv;
    }

    public static zzaf zzm() {
        return zza.zzw;
    }

    public static zzbvx zzn() {
        return zza.zzq;
    }

    public static zzbyo zzo() {
        return zza.zzB;
    }

    public static zzbzs zzp() {
        return zza.zzi;
    }

    public static zzbzz zzq() {
        return zza.zzf;
    }

    public static zzs zzr() {
        return zza.zzd;
    }

    public static zzaa zzs() {
        return zza.zzg;
    }

    public static zzab zzt() {
        return zza.zzj;
    }

    public static zzay zzu() {
        return zza.zzp;
    }

    public static zzbt zzv() {
        return zza.zzu;
    }

    public static zzbu zzw() {
        return zza.zzy;
    }

    public static zzci zzx() {
        return zza.zzC;
    }

    public static zzcal zzy() {
        return zza.zzr;
    }

    public static zzcas zzz() {
        return zza.zzE;
    }
}
