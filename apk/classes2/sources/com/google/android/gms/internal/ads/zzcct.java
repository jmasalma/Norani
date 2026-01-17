package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcct extends zzcbh implements TextureView.SurfaceTextureListener, zzcbr {
    private final zzccb zzc;
    private final zzccc zzd;
    private final zzcca zze;
    private final zzdsj zzf;
    private zzcbg zzg;
    private Surface zzh;
    private zzcbs zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm = 1;
    private zzcbz zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcct(Context context, zzccc zzccc, zzccb zzccb, boolean z, boolean z2, zzcca zzcca, zzdsj zzdsj) {
        super(context);
        this.zzc = zzccb;
        this.zzd = zzccc;
        this.zzo = z;
        this.zze = zzcca;
        zzccc.zza(this);
        this.zzf = zzdsj;
    }

    public static /* synthetic */ void zzG(zzcct zzcct) {
        zzcbg zzcbg = zzcct.zzg;
        if (zzcbg != null) {
            zzcbg.zzi();
        }
    }

    public static /* synthetic */ void zzH(zzcct zzcct, int i) {
        zzcbg zzcbg = zzcct.zzg;
        if (zzcbg != null) {
            zzcbg.onWindowVisibilityChanged(i);
        }
    }

    public static /* synthetic */ void zzI(zzcct zzcct, String str) {
        zzcbg zzcbg = zzcct.zzg;
        if (zzcbg != null) {
            zzcbg.zzb("ExoPlayerAdapter error", str);
        }
    }

    public static /* synthetic */ void zzJ(zzcct zzcct) {
        zzcbg zzcbg = zzcct.zzg;
        if (zzcbg != null) {
            zzcbg.zze();
        }
    }

    public static /* synthetic */ void zzK(zzcct zzcct) {
        zzcbg zzcbg = zzcct.zzg;
        if (zzcbg != null) {
            zzcbg.zza();
        }
    }

    public static /* synthetic */ void zzL(zzcct zzcct) {
        zzcbg zzcbg = zzcct.zzg;
        if (zzcbg != null) {
            zzcbg.zzh();
        }
    }

    public static /* synthetic */ void zzM(zzcct zzcct) {
        float zza = zzcct.zzb.zza();
        zzcbs zzcbs = zzcct.zzi;
        if (zzcbs != null) {
            try {
                zzcbs.zzT(zza, false);
            } catch (IOException e) {
                int i = zze.zza;
                zzo.zzk("", e);
            }
        } else {
            int i2 = zze.zza;
            zzo.zzj("Trying to set volume before player is initialized.");
        }
    }

    public static /* synthetic */ void zzN(zzcct zzcct) {
        zzcbg zzcbg = zzcct.zzg;
        if (zzcbg != null) {
            zzcbg.zzd();
        }
    }

    public static /* synthetic */ void zzO(zzcct zzcct, int i, int i2) {
        zzcbg zzcbg = zzcct.zzg;
        if (zzcbg != null) {
            zzcbg.zzj(i, i2);
        }
    }

    public static /* synthetic */ void zzP(zzcct zzcct) {
        zzcbg zzcbg = zzcct.zzg;
        if (zzcbg != null) {
            zzcbg.zzf();
        }
    }

    public static /* synthetic */ void zzQ(zzcct zzcct, String str) {
        zzcbg zzcbg = zzcct.zzg;
        if (zzcbg != null) {
            zzcbg.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public static /* synthetic */ void zzS(zzcct zzcct) {
        zzcbg zzcbg = zzcct.zzg;
        if (zzcbg != null) {
            zzcbg.zzg();
        }
    }

    private static String zzT(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    private final void zzU() {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            zzcbs.zzQ(true);
        }
    }

    private final void zzV() {
        if (!this.zzp) {
            this.zzp = true;
            zzs.zza.post(new zzccs(this));
            zzn();
            this.zzd.zzb();
            if (this.zzq) {
                zzp();
            }
        }
    }

    private final void zzW(boolean z, Integer num) {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null && !z) {
            zzcbs.zzP(num);
        } else if (this.zzj != null && this.zzh != null) {
            if (z) {
                if (zzad()) {
                    zzcbs.zzU();
                    zzY();
                } else {
                    int i = zze.zza;
                    zzo.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzj.startsWith("cache:")) {
                zzcdn zzo2 = this.zzc.zzo(this.zzj);
                if (zzo2 instanceof zzcdw) {
                    zzcbs zza = ((zzcdw) zzo2).zza();
                    this.zzi = zza;
                    zza.zzP(num);
                    if (!this.zzi.zzV()) {
                        int i2 = zze.zza;
                        zzo.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzo2 instanceof zzcdt) {
                    zzcdt zzcdt = (zzcdt) zzo2;
                    String zzF = zzF();
                    ByteBuffer zzl2 = zzcdt.zzl();
                    boolean zzm2 = zzcdt.zzm();
                    String zzk2 = zzcdt.zzk();
                    if (zzk2 == null) {
                        int i3 = zze.zza;
                        zzo.zzj("Stream cache URL is null.");
                        return;
                    }
                    zzcbs zzE = zzE(num);
                    this.zzi = zzE;
                    zzE.zzG(new Uri[]{Uri.parse(zzk2)}, zzF, zzl2, zzm2);
                } else {
                    String valueOf = String.valueOf(this.zzj);
                    int i4 = zze.zza;
                    zzo.zzj("Stream cache miss: ".concat(valueOf));
                    return;
                }
            } else {
                this.zzi = zzE(num);
                String zzF2 = zzF();
                Uri[] uriArr = new Uri[this.zzk.length];
                int i5 = 0;
                while (true) {
                    String[] strArr = this.zzk;
                    if (i5 >= strArr.length) {
                        break;
                    }
                    uriArr[i5] = Uri.parse(strArr[i5]);
                    i5++;
                }
                this.zzi.zzF(uriArr, zzF2);
            }
            this.zzi.zzL(this);
            zzZ(this.zzh, false);
            if (this.zzi.zzV()) {
                int zzt2 = this.zzi.zzt();
                this.zzm = zzt2;
                if (zzt2 == 3) {
                    zzV();
                }
            }
        }
    }

    private final void zzX() {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            zzcbs.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzi != null) {
            zzZ((Surface) null, true);
            zzcbs zzcbs = this.zzi;
            if (zzcbs != null) {
                zzcbs.zzL((zzcbr) null);
                this.zzi.zzH();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzZ(Surface surface, boolean z) {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            try {
                zzcbs.zzS(surface, z);
            } catch (IOException e) {
                int i = zze.zza;
                zzo.zzk("", e);
            }
        } else {
            int i2 = zze.zza;
            zzo.zzj("Trying to set surface before player is initialized.");
        }
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.zzt != f) {
            this.zzt = f;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzm != 1;
    }

    private final boolean zzad() {
        zzcbs zzcbs = this.zzi;
        return zzcbs != null && zzcbs.zzV() && !this.zzl;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzt;
        if (f != 0.0f && this.zzn == null) {
            float f2 = (float) measuredWidth;
            float f3 = f2 / ((float) measuredHeight);
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (((float) measuredHeight) * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcbz zzcbz = this.zzn;
        if (zzcbz != null) {
            zzcbz.zzc(measuredWidth, measuredHeight);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzdsj zzdsj;
        if (this.zzo) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zznF)).booleanValue() && (zzdsj = this.zzf) != null) {
                zzdsi zza = zzdsj.zza();
                zza.zzb("action", "svp_aepv");
                zza.zzj();
            }
            zzcbz zzcbz = new zzcbz(getContext());
            this.zzn = zzcbz;
            zzcbz.zzd(surfaceTexture, i, i2);
            zzcbz zzcbz2 = this.zzn;
            zzcbz2.start();
            SurfaceTexture zzb = zzcbz2.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzn.zze();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzW(false, (Integer) null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        zzs.zza.post(new zzccp(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcbz zzcbz = this.zzn;
        if (zzcbz != null) {
            zzcbz.zze();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzX();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzZ((Surface) null, true);
        }
        zzs.zza.post(new zzccl(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzcbz zzcbz = this.zzn;
        if (zzcbz != null) {
            zzcbz.zzc(i, i2);
        }
        zzs.zza.post(new zzcck(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzg);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        zzs.zza.post(new zzccj(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void zzA(int i) {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            zzcbs.zzN(i);
        }
    }

    public final void zzB(int i) {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            zzcbs.zzR(i);
        }
    }

    public final void zzD(int i, int i2) {
        this.zzr = i;
        this.zzs = i2;
        zzaa();
    }

    /* access modifiers changed from: package-private */
    public final zzcbs zzE(Integer num) {
        zzcca zzcca = this.zze;
        zzccb zzccb = this.zzc;
        zzceo zzceo = new zzceo(zzccb.getContext(), zzcca, zzccb, num);
        int i = zze.zza;
        zzo.zzi("ExoPlayerAdapter initialized.");
        return zzceo;
    }

    /* access modifiers changed from: package-private */
    public final String zzF() {
        zzccb zzccb = this.zzc;
        return zzv.zzr().zzc(zzccb.getContext(), zzccb.zzm().afmaVersion);
    }

    public final int zza() {
        if (zzac()) {
            return (int) this.zzi.zzy();
        }
        return 0;
    }

    public final int zzb() {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            return zzcbs.zzr();
        }
        return -1;
    }

    public final int zzc() {
        if (zzac()) {
            return (int) this.zzi.zzz();
        }
        return 0;
    }

    public final int zzd() {
        return this.zzs;
    }

    public final int zze() {
        return this.zzr;
    }

    public final long zzf() {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            return zzcbs.zzx();
        }
        return -1;
    }

    public final long zzg() {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            return zzcbs.zzA();
        }
        return -1;
    }

    public final long zzh() {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            return zzcbs.zzB();
        }
        return -1;
    }

    public final void zzi(boolean z, long j) {
        if (this.zzc != null) {
            zzcaf.zzf.execute(new zzccm(this, z, j));
        }
    }

    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    public final void zzk(String str, Exception exc) {
        String zzT = zzT(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(zzT);
        int i = zze.zza;
        zzo.zzj(concat);
        this.zzl = true;
        if (this.zze.zza) {
            zzX();
        }
        zzs.zza.post(new zzccq(this, zzT));
        zzv.zzp().zzv(exc, "AdExoPlayerView.onError");
    }

    public final void zzl(String str, Exception exc) {
        String zzT = zzT("onLoadException", exc);
        String concat = "ExoPlayerAdapter exception: ".concat(zzT);
        int i = zze.zza;
        zzo.zzj(concat);
        zzv.zzp().zzv(exc, "AdExoPlayerView.onException");
        zzs.zza.post(new zzccn(this, zzT));
    }

    public final void zzm(int i) {
        if (this.zzm != i) {
            this.zzm = i;
            if (i == 3) {
                zzV();
            } else if (i == 4) {
                if (this.zze.zza) {
                    zzX();
                }
                this.zzd.zze();
                this.zzb.zzc();
                zzs.zza.post(new zzccr(this));
            }
        }
    }

    public final void zzn() {
        zzs.zza.post(new zzcci(this));
    }

    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzi.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            zzs.zza.post(new zzcco(this));
        }
    }

    public final void zzp() {
        if (zzac()) {
            if (this.zze.zza) {
                zzU();
            }
            this.zzi.zzO(true);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            zzs.zza.post(new zzcch(this));
            return;
        }
        this.zzq = true;
    }

    public final void zzq(int i) {
        if (zzac()) {
            this.zzi.zzI((long) i);
        }
    }

    public final void zzr(zzcbg zzcbg) {
        this.zzg = zzcbg;
    }

    public final void zzs(String str) {
        if (str != null) {
            zzC(str, (String[]) null, (Integer) null);
        }
    }

    public final void zzt() {
        if (zzad()) {
            this.zzi.zzU();
            zzY();
        }
        zzccc zzccc = this.zzd;
        zzccc.zze();
        this.zzb.zzc();
        zzccc.zzd();
    }

    public final void zzu(float f, float f2) {
        zzcbz zzcbz = this.zzn;
        if (zzcbz != null) {
            zzcbz.zzf(f, f2);
        }
    }

    public final void zzv() {
        zzs.zza.post(new zzccg(this));
    }

    public final Integer zzw() {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            return zzcbs.zzC();
        }
        return null;
    }

    public final void zzx(int i) {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            zzcbs.zzJ(i);
        }
    }

    public final void zzy(int i) {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            zzcbs.zzK(i);
        }
    }

    public final void zzz(int i) {
        zzcbs zzcbs = this.zzi;
        if (zzcbs != null) {
            zzcbs.zzM(i);
        }
    }

    public final void zzC(String str, String[] strArr, Integer num) {
        if (str != null) {
            boolean z = true;
            if (strArr == null) {
                this.zzk = new String[]{str};
            } else {
                this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            String str2 = this.zzj;
            if (!this.zze.zzk || str2 == null || str.equals(str2) || this.zzm != 4) {
                z = false;
            }
            this.zzj = str;
            zzW(z, num);
        }
    }
}
