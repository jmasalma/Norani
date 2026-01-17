package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbst extends zzbsu implements zzbkf {
    DisplayMetrics zza;
    int zzb = -1;
    int zzc = -1;
    int zzd = -1;
    int zze = -1;
    int zzf = -1;
    int zzg = -1;
    private final zzcfg zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbcm zzk;
    private float zzl;
    private int zzm;

    public zzbst(zzcfg zzcfg, Context context, zzbcm zzbcm) {
        super(zzcfg, "");
        this.zzh = zzcfg;
        this.zzi = context;
        this.zzk = zzbcm;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        zzcfg zzcfg = (zzcfg) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        zzbb.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzf.zzA(displayMetrics, displayMetrics.widthPixels);
        zzbb.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzf.zzA(displayMetrics2, displayMetrics2.heightPixels);
        zzcfg zzcfg2 = this.zzh;
        Activity zzi2 = zzcfg2.zzi();
        if (zzi2 == null || zzi2.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            zzv.zzr();
            int[] zzR = zzs.zzR(zzi2);
            zzbb.zzb();
            this.zzd = zzf.zzA(this.zza, zzR[0]);
            zzbb.zzb();
            this.zze = zzf.zzA(this.zza, zzR[1]);
        }
        if (zzcfg2.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzcfg2.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbss zzbss = new zzbss();
        zzbcm zzbcm = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbss.zze(zzbcm.zza(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbss.zzc(zzbcm.zza(intent2));
        zzbss.zza(zzbcm.zzb());
        zzbss.zzd(zzbcm.zzc());
        zzbss.zzb(true);
        boolean zzh2 = zzbss.zza;
        boolean zzj2 = zzbss.zzb;
        boolean zzf2 = zzbss.zzc;
        boolean zzi3 = zzbss.zzd;
        try {
            jSONObject = new JSONObject().put("sms", zzh2).put("tel", zzj2).put("calendar", zzf2).put("storePicture", zzi3).put("inlineVideo", zzbss.zze);
        } catch (JSONException e) {
            int i = zze.zza;
            zzo.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcfg2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        zzcfg2.getLocationOnScreen(iArr);
        Context context = this.zzi;
        zzb(zzbb.zzb().zzb(context, iArr[0]), zzbb.zzb().zzb(context, iArr[1]));
        if (zze.zzm(2)) {
            zzo.zzi("Dispatching Ready Event.");
        }
        zzi(zzcfg2.zzm().afmaVersion);
    }

    public final void zzb(int i, int i2) {
        int i3;
        Context context = this.zzi;
        int i4 = 0;
        if (context instanceof Activity) {
            zzv.zzr();
            i3 = zzs.zzS((Activity) context)[0];
        } else {
            i3 = 0;
        }
        zzcfg zzcfg = this.zzh;
        if (zzcfg.zzO() == null || !zzcfg.zzO().zzi()) {
            int width = zzcfg.getWidth();
            int height = zzcfg.getHeight();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzai)).booleanValue()) {
                if (width == 0) {
                    width = zzcfg.zzO() != null ? zzcfg.zzO().zzb : 0;
                }
                if (height == 0) {
                    if (zzcfg.zzO() != null) {
                        i4 = zzcfg.zzO().zza;
                    }
                    this.zzf = zzbb.zzb().zzb(context, width);
                    this.zzg = zzbb.zzb().zzb(context, i4);
                }
            }
            i4 = height;
            this.zzf = zzbb.zzb().zzb(context, width);
            this.zzg = zzbb.zzb().zzb(context, i4);
        }
        zzg(i, i2 - i3, this.zzf, this.zzg);
        zzcfg.zzN().zzE(i, i2);
    }
}
