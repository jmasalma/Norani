package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzegb implements zzefv {
    private final zzdhb zza;
    private final zzgdy zzb;
    private final zzdln zzc;
    private final zzfdv zzd;
    private final zzdoe zze;
    private final zzdsd zzf;
    private final VersionInfoParcel zzg;
    private final Context zzh;
    private final zzbxw zzi;

    public zzegb(zzdhb zzdhb, zzgdy zzgdy, zzdln zzdln, zzfdv zzfdv, zzdoe zzdoe, zzdsd zzdsd, VersionInfoParcel versionInfoParcel, Context context, zzbxw zzbxw) {
        this.zzg = versionInfoParcel;
        this.zzh = context;
        this.zzi = zzbxw;
        this.zza = zzdhb;
        this.zzb = zzgdy;
        this.zzc = zzdln;
        this.zzd = zzfdv;
        this.zze = zzdoe;
        this.zzf = zzdsd;
    }

    public static /* synthetic */ zzdio zzc(zzegb zzegb, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzfcn zzfcn, zzfca zzfca, JSONObject jSONObject, zzb zzb2, zzbya zzbya) {
        zzdit zzdit = (zzdit) listenableFuture.get();
        zzdny zzdny = (zzdny) listenableFuture2.get();
        zzbcv zzbcv = zzbde.zzct;
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzegb.zzf.zza().putLong(zzdrr.RENDERING_WEBVIEW_CREATION_END.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdiu zzd2 = zzegb.zza.zzd(new zzcrq(zzfcn, zzfca, (String) null), new zzdjf(zzdit), new zzdhp(jSONObject, zzdny, zzb2, zzbya));
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            long currentTimeMillis = zzv.zzD().currentTimeMillis();
            zzdsd zzdsd = zzegb.zzf;
            zzdsd.zza().putLong(zzdrr.RENDERING_AD_COMPONENT_CREATION_END.zza(), currentTimeMillis);
            zzdsd.zza().putLong(zzdrr.RENDERING_CONFIGURE_WEBVIEW_START.zza(), currentTimeMillis);
        }
        zzd2.zzh().zzb();
        zzd2.zzi().zza(zzdny);
        zzd2.zzg().zzc(zzdit.zzs());
        zzd2.zzl().zza(zzegb.zze, zzdit.zzq());
        if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
            zzegb.zzf.zza().putLong(zzdrr.RENDERING_CONFIGURE_WEBVIEW_END.zza(), zzv.zzD().currentTimeMillis());
        }
        return zzd2.zza();
    }

    public static /* synthetic */ ListenableFuture zzd(zzegb zzegb, zzfcn zzfcn, zzfca zzfca, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgdn.zzg(new zzdwm(3));
        }
        int i = zzfcn.zza.zza.zzk;
        if (i <= 1) {
            return zzgdn.zzm(zzegb.zzg(zzfcn, zzfca, jSONArray.getJSONObject(0)), new zzega(), zzegb.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcu)).booleanValue()) {
            zzegb.zzf.zzd("nsl", String.valueOf(length));
        }
        zzegb.zzd.zzc(Math.min(length, i));
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < length) {
                arrayList.add(zzegb.zzg(zzfcn, zzfca, jSONArray.getJSONObject(i2)));
            } else {
                arrayList.add(zzgdn.zzg(new zzdwm(3)));
            }
        }
        return zzgdn.zzh(arrayList);
    }

    public static /* synthetic */ ListenableFuture zze(zzegb zzegb, zzfca zzfca, zzdny zzdny) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcs)).booleanValue()) {
            zzegb.zzf.zza().putLong(zzdrr.RENDERING_NATIVE_ADS_PREPROCESS_START.zza(), zzv.zzD().currentTimeMillis());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjb)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfca.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgdn.zzn(zzdny.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzefx(zzegb, zzdny), zzegb.zzb);
    }

    public static /* synthetic */ ListenableFuture zzf(zzegb zzegb, zzdny zzdny, JSONObject jSONObject) {
        zzegb.zzd.zzb(zzgdn.zzh(zzdny));
        if (jSONObject.optBoolean("success")) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzcs)).booleanValue()) {
                zzegb.zzf.zza().putLong(zzdrr.RENDERING_NATIVE_ADS_PREPROCESS_END.zza(), zzv.zzD().currentTimeMillis());
            }
            return zzgdn.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbol("process json failed");
    }

    private final ListenableFuture zzg(zzfcn zzfcn, zzfca zzfca, JSONObject jSONObject) {
        zzbya zzbya;
        zzb zzb2;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzct)).booleanValue()) {
            this.zzf.zza().putLong(zzdrr.RENDERING_WEBVIEW_CREATION_START.zza(), zzv.zzD().currentTimeMillis());
        }
        ListenableFuture zza2 = this.zzd.zza();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznP)).booleanValue()) {
            Context context = this.zzh;
            zzbya zza3 = zzcvt.zza(context, this.zzg, zzfca, this.zzi);
            zzbya = zza3;
            zzb2 = new zzb(context, zza3, (zzbuy) null);
        } else {
            zzfca zzfca2 = zzfca;
            zzbya = null;
            zzb2 = new zzb(this.zzh, (zzbya) null, (zzbuy) null);
        }
        ListenableFuture zzd2 = this.zzc.zzd(zzfcn, zzfca, jSONObject, zzb2, zzbya);
        return zzgdn.zzc(zza2, zzd2).zza(new zzefw(this, zzd2, zza2, zzfcn, zzfca, jSONObject, zzb2, zzbya), this.zzb);
    }

    public final ListenableFuture zza(zzfcn zzfcn, zzfca zzfca) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcs)).booleanValue()) {
            this.zzf.zza().putLong(zzdrr.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza(), zzv.zzD().currentTimeMillis());
        }
        ListenableFuture zza2 = this.zzd.zza();
        zzefy zzefy = new zzefy(this, zzfca);
        zzgdy zzgdy = this.zzb;
        return zzgdn.zzn(zzgdn.zzn(zza2, zzefy, zzgdy), new zzefz(this, zzfcn, zzfca), zzgdy);
    }

    public final boolean zzb(zzfcn zzfcn, zzfca zzfca) {
        zzfcf zzfcf = zzfca.zzs;
        return (zzfcf == null || zzfcf.zzc == null) ? false : true;
    }
}
