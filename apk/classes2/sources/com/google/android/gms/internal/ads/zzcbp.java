package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcbp extends FrameLayout implements zzcbg {
    final zzccd zza;
    private final zzccb zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbdt zze;
    private final long zzf;
    private final zzcbh zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcbp(Context context, zzccb zzccb, int i, boolean z, zzbdt zzbdt, zzcca zzcca, zzdsj zzdsj) {
        super(context);
        zzcbh zzcbh;
        String str;
        Context context2 = context;
        int i2 = i;
        zzbdt zzbdt2 = zzbdt;
        this.zzb = zzccb;
        this.zze = zzbdt2;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzccb.zzj());
        zzcbi zzcbi = zzccb.zzj().zza;
        zzccc zzccc = new zzccc(context, zzccb.zzm(), zzccb.zzs(), zzbdt, zzccb.zzk());
        if (i2 == 3) {
            zzcbh = new zzcev(context2, zzccc);
        } else if (i2 == 2) {
            zzcbh = new zzcct(context, zzccc, zzccb, z, zzcbt.zza(zzccb), zzcca, zzdsj);
        } else {
            Context context3 = context;
            zzcbh = new zzcbf(context3, zzccb, z, zzcbt.zza(zzccb), zzcca, new zzccc(context3, zzccb.zzm(), zzccb.zzs(), zzbdt, zzccb.zzk()), zzdsj);
        }
        this.zzg = zzcbh;
        View view = new View(context2);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcbh, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzX)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzU)).booleanValue()) {
            zzp();
        }
        this.zzq = new ImageView(context2);
        this.zzf = ((Long) zzbd.zzc().zzb(zzbde.zzZ)).longValue();
        boolean booleanValue = ((Boolean) zzbd.zzc().zzb(zzbde.zzW)).booleanValue();
        this.zzk = booleanValue;
        if (zzbdt2 != null) {
            if (true != booleanValue) {
                str = "0";
            } else {
                str = "1";
            }
            zzbdt2.zzd("spinner_used", str);
        }
        this.zza = new zzccd(this);
        zzcbh.zzr(this);
    }

    private final void zzJ() {
        zzccb zzccb = this.zzb;
        if (zzccb.zzi() != null && this.zzi && !this.zzj) {
            zzccb.zzi().getWindow().clearFlags(128);
            this.zzi = false;
        }
    }

    /* access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl2 = zzl();
        if (zzl2 != null) {
            hashMap.put("playerId", zzl2.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            zzcbh zzcbh = this.zzg;
            if (zzcbh != null) {
                zzgdy zzgdy = zzcaf.zzf;
                Objects.requireNonNull(zzcbh);
                zzgdy.execute(new zzcbj(zzcbh));
            }
        } finally {
            super.finalize();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        zzs.zza.post(new zzcbl(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        zzs.zza.post(new zzcbo(this, z));
    }

    public final void zzA(int i) {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzz(i);
        }
    }

    public final void zzB(int i) {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzA(i);
        }
    }

    public final void zzC(int i) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzX)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzB(i);
        }
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i, int i2, int i3, int i4) {
        if (zze.zzc()) {
            zze.zza("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 != 0 && i4 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
            layoutParams.setMargins(i, i2, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzG(float f) {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzb.zze(f);
            zzcbh.zzn();
        }
    }

    public final void zzH(float f, float f2) {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzu(f, f2);
        }
    }

    public final void zzI() {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzb.zzd(false);
            zzcbh.zzn();
        }
    }

    public final void zza() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzce)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    public final void zze() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzce)).booleanValue()) {
            this.zza.zzb();
        }
        zzccb zzccb = this.zzb;
        if (zzccb.zzi() != null && !this.zzi) {
            boolean z = (zzccb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                zzccb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    public final void zzf() {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null && this.zzm == 0) {
            zzK("canplaythrough", "duration", String.valueOf(((float) zzcbh.zzc()) / 1000.0f), "videoWidth", String.valueOf(zzcbh.zze()), "videoHeight", String.valueOf(zzcbh.zzd()));
        }
    }

    public final void zzg() {
        this.zzd.setVisibility(4);
        zzs.zza.post(new zzcbk(this));
    }

    public final void zzh() {
        this.zza.zzb();
        zzs.zza.post(new zzcbm(this));
    }

    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        zzs.zza.post(new zzcbn(this));
    }

    public final void zzj(int i, int i2) {
        if (this.zzk) {
            zzbcv zzbcv = zzbde.zzY;
            int max = Math.max(i / ((Integer) zzbd.zzc().zzb(zzbcv)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzbd.zzc().zzb(zzbcv)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap == null || bitmap.getWidth() != max || this.zzp.getHeight() != max2) {
                this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                this.zzr = false;
            }
        }
    }

    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null && this.zzp != null) {
            long elapsedRealtime = zzv.zzD().elapsedRealtime();
            if (zzcbh.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            long elapsedRealtime2 = zzv.zzD().elapsedRealtime() - elapsedRealtime;
            if (zze.zzc()) {
                zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
            }
            if (elapsedRealtime2 > this.zzf) {
                zzo.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbdt zzbdt = this.zze;
                if (zzbdt != null) {
                    zzbdt.zzd("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    public final Integer zzl() {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            return zzcbh.zzw();
        }
        return null;
    }

    public final void zzp() {
        String str;
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            TextView textView = new TextView(zzcbh.getContext());
            Resources zze2 = zzv.zzp().zze();
            if (zze2 == null) {
                str = "AdMob - ";
            } else {
                str = zze2.getString(R.string.watermark_label_prefix);
            }
            textView.setText(String.valueOf(str).concat(zzcbh.zzj()));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
            frameLayout.bringChildToFront(textView);
        }
    }

    public final void zzq() {
        this.zza.zza();
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzt();
        }
        zzJ();
    }

    public final void zzr(Integer num) {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            if (!TextUtils.isEmpty(this.zzn)) {
                zzcbh.zzC(this.zzn, this.zzo, num);
            } else {
                zzK("no_src", new String[0]);
            }
        }
    }

    public final void zzs() {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzb.zzd(true);
            zzcbh.zzn();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt() {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            long zza2 = (long) zzcbh.zza();
            if (this.zzl != zza2 && zza2 > 0) {
                float f = ((float) zza2) / 1000.0f;
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzcc)).booleanValue()) {
                    zzK("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(zzcbh.zzh()), "qoeCachedBytes", String.valueOf(zzcbh.zzf()), "qoeLoadedBytes", String.valueOf(zzcbh.zzg()), "droppedFrames", String.valueOf(zzcbh.zzb()), "reportTime", String.valueOf(zzv.zzD().currentTimeMillis()));
                } else {
                    zzK("timeupdate", "time", String.valueOf(f));
                }
                this.zzl = zza2;
            }
        }
    }

    public final void zzu() {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzo();
        }
    }

    public final void zzv() {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzp();
        }
    }

    public final void zzw(int i) {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzq(i);
        }
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.dispatchTouchEvent(motionEvent);
        }
    }

    public final void zzy(int i) {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzx(i);
        }
    }

    public final void zzz(int i) {
        zzcbh zzcbh = this.zzg;
        if (zzcbh != null) {
            zzcbh.zzy(i);
        }
    }
}
