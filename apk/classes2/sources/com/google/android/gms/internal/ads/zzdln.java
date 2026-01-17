package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdln {
    private final zzgdy zza;
    private final zzdmc zzb;
    private final zzdmh zzc;
    /* access modifiers changed from: private */
    public final zzdsd zzd;

    zzdln(zzgdy zzgdy, zzdmc zzdmc, zzdmh zzdmh, zzdsd zzdsd) {
        this.zza = zzgdy;
        this.zzb = zzdmc;
        this.zzc = zzdmh;
        this.zzd = zzdsd;
    }

    public static /* synthetic */ zzdit zza(zzdln zzdln, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, ListenableFuture listenableFuture5, JSONObject jSONObject, ListenableFuture listenableFuture6, ListenableFuture listenableFuture7, ListenableFuture listenableFuture8, ListenableFuture listenableFuture9, ListenableFuture listenableFuture10) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcs)).booleanValue()) {
            zzdln.zzd.zza().putLong(zzdrr.RENDERING_NATIVE_ASSETS_LOADING_END.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdit zzdit = (zzdit) listenableFuture.get();
        zzdit.zzP((List) listenableFuture2.get());
        zzdit.zzM((zzbgp) listenableFuture3.get());
        zzdit.zzQ((zzbgp) listenableFuture4.get());
        zzdit.zzJ((zzbgi) listenableFuture5.get());
        zzdit.zzS(zzdmc.zzl(jSONObject));
        zzdit.zzL(zzdmc.zzk(jSONObject));
        zzcfg zzcfg = (zzcfg) listenableFuture6.get();
        if (zzcfg != null) {
            zzdit.zzad(zzcfg);
            zzdit.zzac(zzcfg.zzF());
            zzdit.zzab(zzcfg.zzq());
        }
        zzdit.zzd().putAll((Bundle) listenableFuture7.get());
        zzcfg zzcfg2 = (zzcfg) listenableFuture8.get();
        if (zzcfg2 != null) {
            zzdit.zzO(zzcfg2);
            zzdit.zzae(zzcfg2.zzF());
        }
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfG)).booleanValue() || zzf(jSONObject)) {
            zzcfg zzcfg3 = (zzcfg) listenableFuture9.get();
            if (zzcfg3 != null) {
                zzdit.zzT(zzcfg3);
            }
        } else {
            zzdit.zzU(listenableFuture9);
            zzdit.zzX(new zzcak());
        }
        for (zzdmg zzdmg : (List) listenableFuture10.get()) {
            if (zzdmg.zza != 1) {
                zzdit.zzN(zzdmg.zzb, zzdmg.zzd);
            } else {
                zzdit.zzZ(zzdmg.zzb, zzdmg.zzc);
            }
        }
        return zzdit;
    }

    public static /* synthetic */ zzdit zzb(zzdln zzdln, zzfcn zzfcn, zzfca zzfca, JSONObject jSONObject) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            zzdln.zzd.zza().putLong(zzdrr.NATIVE_ASSETS_LOADING_BASIC_START.zza(), zzv.zzD().currentTimeMillis());
        }
        zzdit zzdit = new zzdit();
        zzdit.zzaa(jSONObject.optInt("template_id", -1));
        zzdit.zzK(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdit.zzV(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzfcw zzfcw = zzfcn.zza.zza;
        if (zzfcw.zzg.contains(Integer.toString(zzdit.zzc()))) {
            if (zzdit.zzc() == 3) {
                if (zzdit.zzA() == null) {
                    throw new zzehf(1, "No custom template id for custom template ad response.");
                } else if (!zzfcw.zzh.contains(zzdit.zzA())) {
                    throw new zzehf(1, "Unexpected custom template id in the response.");
                }
            }
            zzdit.zzY(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (zzfca.zzM) {
                zzv.zzr();
                optString = zzs.zzz() + " : " + optString;
            }
            zzdit.zzZ("headline", optString);
            zzdit.zzZ("body", jSONObject.optString("body", (String) null));
            zzdit.zzZ("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzdit.zzZ("store", jSONObject.optString("store", (String) null));
            zzdit.zzZ("price", jSONObject.optString("price", (String) null));
            zzdit.zzZ("advertiser", jSONObject.optString("advertiser", (String) null));
            return zzdit;
        }
        throw new zzehf(1, "Invalid template ID: " + zzdit.zzc());
    }

    private final ListenableFuture zze(ListenableFuture listenableFuture, zzdrr zzdrr) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            zzgdn.zzr(listenableFuture, new zzdlm(this, zzdrr), this.zza);
        }
        return listenableFuture;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    public final ListenableFuture zzd(zzfcn zzfcn, zzfca zzfca, JSONObject jSONObject, zzb zzb2, zzbya zzbya) {
        ListenableFuture listenableFuture;
        JSONArray optJSONArray;
        zzfcn zzfcn2 = zzfcn;
        JSONObject jSONObject2 = jSONObject;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcs)).booleanValue()) {
            this.zzd.zza().putLong(zzdrr.RENDERING_NATIVE_ASSETS_LOADING_START.zza(), zzv.zzD().currentTimeMillis());
        }
        ListenableFuture zzb3 = this.zza.zzb(new zzdlk(this, zzfcn2, zzfca, jSONObject2));
        zze(zzb3, zzdrr.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdmc zzdmc = this.zzb;
        ListenableFuture zzf = zzdmc.zzf(jSONObject2, "images", zzdrr.NATIVE_ASSETS_LOADING_IMAGE_START);
        zze(zzf, zzdrr.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfcd zzfcd = zzfcn2.zzb.zzb;
        ListenableFuture zzg = zzdmc.zzg(jSONObject, "images", zzfca, zzfcd, zzb2, zzbya);
        zze(zzg, zzdrr.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        ListenableFuture zze = zzdmc.zze(jSONObject2, "secondary_image", zzdrr.NATIVE_ASSETS_LOADING_LOGO_START);
        zze(zze, zzdrr.NATIVE_ASSETS_LOADING_LOGO_END);
        ListenableFuture zze2 = zzdmc.zze(jSONObject2, "app_icon", zzdrr.NATIVE_ASSETS_LOADING_ICON_START);
        zze(zze2, zzdrr.NATIVE_ASSETS_LOADING_ICON_END);
        ListenableFuture zzd2 = zzdmc.zzd(jSONObject2, "attribution", zzdrr.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        zze(zzd2, zzdrr.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        ListenableFuture listenableFuture2 = zzd2;
        ListenableFuture zzj = zzdmc.zzj(jSONObject, zzfca, zzfcd, zzb2, zzbya);
        zze(zzj, zzdrr.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznr)).booleanValue() && jSONObject2.has("video")) {
            JSONObject optJSONObject = jSONObject2.optJSONObject("video");
            if (optJSONObject.has("flags") && (optJSONArray = optJSONObject.optJSONArray("flags")) != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 == null || !optJSONObject2.optString("key").equals("afma_video_player_type")) {
                        i++;
                    } else {
                        try {
                            if (Integer.parseInt(optJSONObject2.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE)) == 3) {
                                listenableFuture = this.zzb.zzh(zzj);
                                zze(listenableFuture, zzdrr.NATIVE_ASSETS_LOADING_MEDIA_END);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                ListenableFuture listenableFuture3 = listenableFuture;
                ListenableFuture zza2 = this.zzc.zza(jSONObject2, "custom_assets");
                zze(zza2, zzdrr.NATIVE_ASSETS_LOADING_CUSTOM_END);
                ListenableFuture zzi = this.zzb.zzi(jSONObject2, zzb2, zzbya);
                zze(zzi, zzdrr.NATIVE_ASSETS_LOADING_OMID_END);
                ArrayList arrayList = new ArrayList();
                arrayList.add(zzb3);
                arrayList.add(zzf);
                arrayList.add(zzg);
                arrayList.add(zze);
                arrayList.add(zze2);
                arrayList.add(listenableFuture2);
                arrayList.add(zzj);
                arrayList.add(listenableFuture3);
                arrayList.add(zza2);
                if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfG)).booleanValue() || zzf(jSONObject)) {
                    arrayList.add(zzi);
                }
                zzdll zzdll = r0;
                ListenableFuture listenableFuture4 = zzb3;
                ListenableFuture listenableFuture5 = zzf;
                ListenableFuture listenableFuture6 = zzi;
                ListenableFuture listenableFuture7 = zzj;
                zzgdl zza3 = zzgdn.zza(arrayList);
                ListenableFuture listenableFuture8 = listenableFuture3;
                zzgdl zzgdl = zza3;
                ListenableFuture listenableFuture9 = zzg;
                zzgdl zzgdl2 = zzgdl;
                zzdll zzdll2 = new zzdll(this, listenableFuture4, listenableFuture5, zze2, zze, listenableFuture2, jSONObject, listenableFuture7, listenableFuture8, listenableFuture9, listenableFuture6, zza2);
                return zzgdl2.zza(zzdll, this.zza);
            }
        }
        listenableFuture = zzgdn.zzh(new Bundle());
        ListenableFuture listenableFuture32 = listenableFuture;
        ListenableFuture zza22 = this.zzc.zza(jSONObject2, "custom_assets");
        zze(zza22, zzdrr.NATIVE_ASSETS_LOADING_CUSTOM_END);
        ListenableFuture zzi2 = this.zzb.zzi(jSONObject2, zzb2, zzbya);
        zze(zzi2, zzdrr.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(zzb3);
        arrayList2.add(zzf);
        arrayList2.add(zzg);
        arrayList2.add(zze);
        arrayList2.add(zze2);
        arrayList2.add(listenableFuture2);
        arrayList2.add(zzj);
        arrayList2.add(listenableFuture32);
        arrayList2.add(zza22);
        arrayList2.add(zzi2);
        zzdll zzdll3 = zzdll2;
        ListenableFuture listenableFuture42 = zzb3;
        ListenableFuture listenableFuture52 = zzf;
        ListenableFuture listenableFuture62 = zzi2;
        ListenableFuture listenableFuture72 = zzj;
        zzgdl zza32 = zzgdn.zza(arrayList2);
        ListenableFuture listenableFuture82 = listenableFuture32;
        zzgdl zzgdl3 = zza32;
        ListenableFuture listenableFuture92 = zzg;
        zzgdl zzgdl22 = zzgdl3;
        zzdll zzdll22 = new zzdll(this, listenableFuture42, listenableFuture52, zze2, zze, listenableFuture2, jSONObject, listenableFuture72, listenableFuture82, listenableFuture92, listenableFuture62, zza22);
        return zzgdl22.zza(zzdll3, this.zza);
    }
}
