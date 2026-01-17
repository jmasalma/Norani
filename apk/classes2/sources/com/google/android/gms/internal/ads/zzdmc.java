package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdmc {
    private final Context zza;
    private final zzdli zzb;
    private final zzavu zzc;
    private final VersionInfoParcel zzd;
    private final zza zze;
    private final zzbcc zzf;
    private final Executor zzg;
    private final zzbge zzh;
    private final zzdmu zzi;
    private final zzdpj zzj;
    private final ScheduledExecutorService zzk;
    private final zzdoe zzl;
    private final zzdsj zzm;
    private final zzfjy zzn;
    private final zzeca zzo;
    private final zzecl zzp;
    private final zzfda zzq;
    private final zzdsd zzr;

    public zzdmc(Context context, zzdli zzdli, zzavu zzavu, VersionInfoParcel versionInfoParcel, zza zza2, zzbcc zzbcc, Executor executor, zzfcw zzfcw, zzdmu zzdmu, zzdpj zzdpj, ScheduledExecutorService scheduledExecutorService, zzdsj zzdsj, zzfjy zzfjy, zzeca zzeca, zzdoe zzdoe, zzecl zzecl, zzfda zzfda, zzdsd zzdsd) {
        this.zza = context;
        this.zzb = zzdli;
        this.zzc = zzavu;
        this.zzd = versionInfoParcel;
        this.zze = zza2;
        this.zzf = zzbcc;
        this.zzg = executor;
        this.zzh = zzfcw.zzi;
        this.zzi = zzdmu;
        this.zzj = zzdpj;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdsj;
        this.zzn = zzfjy;
        this.zzo = zzeca;
        this.zzl = zzdoe;
        this.zzp = zzecl;
        this.zzq = zzfda;
        this.zzr = zzdsd;
    }

    public static /* synthetic */ zzbfz zza(zzdmc zzdmc, JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzs = zzs(jSONObject, "bg_color");
        Integer zzs2 = zzs(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", zzbcj.zzq.zzf);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbfz(optString, list, zzs, zzs2, num, optInt3 + optInt2, zzdmc.zzh.zze, optBoolean);
    }

    public static /* synthetic */ ListenableFuture zzb(zzdmc zzdmc, String str, zzbya zzbya, zzb zzb2, Object obj) {
        zzdmc zzdmc2 = zzdmc;
        zzbya zzbya2 = zzbya;
        zzv.zzB();
        Context context = zzdmc2.zza;
        zzecl zzecl = zzdmc2.zzp;
        zzcfg zza2 = zzcft.zza(context, zzchd.zza(), "native-omid", false, false, zzdmc2.zzc, (zzbel) null, zzdmc2.zzd, (zzbdt) null, (zzn) null, zzdmc2.zze, zzdmc2.zzf, (zzfca) null, (zzfcd) null, zzecl, zzdmc2.zzq, zzdmc2.zzm);
        zzcaj zza3 = zzcaj.zza(zza2);
        zza2.zzN().zzC(new zzdlt(zza3));
        zza2.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznP)).booleanValue()) {
            if (zzbya2 != null) {
                zza2.zzN().zzL(zzbya2);
            }
            zza2.zzN().zzD(zzb2);
        }
        return zza3;
    }

    public static /* synthetic */ ListenableFuture zzc(zzdmc zzdmc, zzr zzr2, zzfca zzfca, zzfcd zzfcd, zzb zzb2, zzbya zzbya, String str, String str2, Object obj) {
        zzdmc zzdmc2 = zzdmc;
        zzcfg zza2 = zzdmc2.zzj.zza(zzr2, zzfca, zzfcd);
        zzcaj zza3 = zzcaj.zza(zza2);
        zzdob zzb3 = zzdmc2.zzl.zzb();
        zzcgy zzN = zza2.zzN();
        zzbcv zzbcv = zzbde.zznP;
        zzN.zzX(zzb3, zzb3, zzb3, zzb3, zzb3, false, (zzbki) null, !((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue() ? new zzb(zzdmc2.zza, (zzbya) null, (zzbuy) null) : zzb2, (zzbsv) null, true != ((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue() ? null : zzbya, zzdmc2.zzo, zzdmc2.zzn, zzdmc2.zzm, (zzbkz) null, zzb3, (zzbky) null, (zzbks) null, (zzbkg) null, (zzcmq) null);
        zza2.zzag("/getNativeAdViewSignals", zzbke.zzs);
        zza2.zzag("/getNativeClickMeta", zzbke.zzt);
        zza2.zzN().zzG(true);
        zza2.zzN().zzC(new zzdly(zza3));
        zza2.zzae(str, str2, (String) null);
        return zza3;
    }

    public static final zzfa zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(optJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfyq.zzn();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfyq.zzn();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzfa zzt = zzt(optJSONArray.optJSONObject(i));
            if (zzt != null) {
                arrayList.add(zzt);
            }
        }
        return zzfyq.zzl(arrayList);
    }

    private static ListenableFuture zzn(ListenableFuture listenableFuture, Object obj) {
        return zzgdn.zzf(listenableFuture, Exception.class, new zzdlu((Object) null), zzcaf.zzg);
    }

    private static ListenableFuture zzo(boolean z, ListenableFuture listenableFuture, Object obj) {
        if (z) {
            return zzgdn.zzn(listenableFuture, new zzdlw(listenableFuture), zzcaf.zzg);
        }
        return zzn(listenableFuture, (Object) null);
    }

    private final ListenableFuture zzp(JSONObject jSONObject, boolean z, zzdrr zzdrr) {
        HashMap hashMap;
        String optString;
        double optDouble;
        int optInt;
        int optInt2;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return zzgdn.zzh((Object) null);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzek)).booleanValue()) {
            if (jSONObject2.has((String) zzbd.zzc().zzb(zzbde.zzel))) {
                HashMap hashMap2 = new HashMap();
                for (String str : ((String) zzbd.zzc().zzb(zzbde.zzem)).split(",")) {
                    try {
                        hashMap2.put(str, jSONObject2.getString(str));
                    } catch (JSONException unused) {
                    }
                }
                hashMap = hashMap2;
                optString = jSONObject2.optString("url");
                if (!TextUtils.isEmpty(optString) && hashMap == null) {
                    return zzgdn.zzh((Object) null);
                }
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzcx)).booleanValue() && zzdrr != null) {
                    this.zzr.zza().putLong(zzdrr.zza(), zzv.zzD().currentTimeMillis());
                }
                optDouble = jSONObject2.optDouble("scale", 1.0d);
                boolean optBoolean = jSONObject2.optBoolean("is_transparent", true);
                optInt = jSONObject2.optInt("width", -1);
                optInt2 = jSONObject2.optInt("height", -1);
                if (!z || hashMap != null) {
                    return zzgdn.zzh(new zzbgc((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2, hashMap));
                }
                return zzo(jSONObject2.optBoolean("require"), zzgdn.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzdls(optString, optDouble, optInt, optInt2), this.zzg), (Object) null);
            }
        }
        hashMap = null;
        optString = jSONObject2.optString("url");
        if (!TextUtils.isEmpty(optString)) {
        }
        this.zzr.zza().putLong(zzdrr.zza(), zzv.zzD().currentTimeMillis());
        optDouble = jSONObject2.optDouble("scale", 1.0d);
        boolean optBoolean2 = jSONObject2.optBoolean("is_transparent", true);
        optInt = jSONObject2.optInt("width", -1);
        optInt2 = jSONObject2.optInt("height", -1);
        if (!z) {
        }
        return zzgdn.zzh(new zzbgc((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2, hashMap));
    }

    private final ListenableFuture zzq(JSONArray jSONArray, boolean z, boolean z2, zzdrr zzdrr) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgdn.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            this.zzr.zza().putLong(zzdrr.zza(), zzv.zzD().currentTimeMillis());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzp(jSONArray.optJSONObject(i), z, (zzdrr) null));
        }
        return zzgdn.zzm(zzgdn.zzd(arrayList), new zzdlp(), this.zzg);
    }

    private final ListenableFuture zzr(JSONObject jSONObject, zzfca zzfca, zzfcd zzfcd, zzb zzb2, zzbya zzbya) {
        ListenableFuture zze2 = this.zzi.zze(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfca, zzfcd, zzm(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzb2, zzbya);
        return zzgdn.zzn(zze2, new zzdlv(zze2), zzcaf.zzg);
    }

    private static Integer zzs(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final zzfa zzt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzfa(optString, optString2);
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str, zzdrr zzdrr) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgdn.zzh((Object) null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzo(optJSONObject.optBoolean("require"), zzgdn.zzm(zzq(optJSONArray, false, true, zzdrr), new zzdlx(this, optJSONObject), this.zzg), (Object) null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, String str, zzdrr zzdrr) {
        return zzp(jSONObject.optJSONObject(str), this.zzh.zzb, zzdrr);
    }

    public final ListenableFuture zzf(JSONObject jSONObject, String str, zzdrr zzdrr) {
        zzbge zzbge = this.zzh;
        return zzq(jSONObject.optJSONArray("images"), zzbge.zzb, zzbge.zzd, zzdrr);
    }

    public final ListenableFuture zzg(JSONObject jSONObject, String str, zzfca zzfca, zzfcd zzfcd, zzb zzb2, zzbya zzbya) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzkw)).booleanValue()) {
            return zzgdn.zzh((Object) null);
        }
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgdn.zzh((Object) null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzgdn.zzh((Object) null);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzek)).booleanValue()) {
            if (optJSONObject.has((String) zzbd.zzc().zzb(zzbde.zzel))) {
                return zzgdn.zzh((Object) null);
            }
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString("html");
        zzr zzm2 = zzm(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzgdn.zzh((Object) null);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            this.zzr.zza().putLong(zzdrr.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza(), zzv.zzD().currentTimeMillis());
        }
        ListenableFuture zzn2 = zzgdn.zzn(zzgdn.zzh((Object) null), new zzdlz(this, zzm2, zzfca, zzfcd, zzb2, zzbya, optString, optString2), zzcaf.zzf);
        return zzgdn.zzn(zzn2, new zzdlq(zzn2), zzcaf.zzg);
    }

    public final ListenableFuture zzh(ListenableFuture listenableFuture) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            this.zzr.zza().putLong(zzdrr.NATIVE_ASSETS_LOADING_MEDIA_START.zza(), zzv.zzD().currentTimeMillis());
        }
        zzcak zzcak = new zzcak();
        zzgdn.zzr(listenableFuture, new zzdmb(this, zzcak), zzcaf.zzf);
        return zzcak;
    }

    public final ListenableFuture zzi(JSONObject jSONObject, zzb zzb2, zzbya zzbya) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgdn.zzh((Object) null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject == null) {
            return zzgdn.zzh((Object) null);
        }
        String optString = optJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(optString)) {
            return zzgdn.zzh((Object) null);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            this.zzr.zza().putLong(zzdrr.NATIVE_ASSETS_LOADING_OMID_START.zza(), zzv.zzD().currentTimeMillis());
        }
        return zzgdn.zzn(zzgdn.zzh((Object) null), new zzdlr(this, optString, zzbya, zzb2), zzcaf.zzf);
    }

    public final ListenableFuture zzj(JSONObject jSONObject, zzfca zzfca, zzfcd zzfcd, zzb zzb2, zzbya zzbya) {
        ListenableFuture listenableFuture;
        boolean z = false;
        JSONObject zzh2 = zzbs.zzh(jSONObject, new String[]{"html_containers", "instream"});
        if (zzh2 != null) {
            return zzr(zzh2, zzfca, zzfcd, zzb2, zzbya);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzgdn.zzh((Object) null);
        }
        String optString = optJSONObject.optString("vast_xml");
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkv)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                int i = zze.zza;
                zzo.zzj("Required field 'vast_xml' or 'html' is missing");
                return zzgdn.zzh((Object) null);
            }
        } else if (!z) {
            listenableFuture = this.zzi.zzd(optJSONObject, zzb2, zzbya);
            return zzn(zzgdn.zzo(listenableFuture, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzec)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
        }
        listenableFuture = zzr(optJSONObject, zzfca, zzfcd, zzb2, zzbya);
        return zzn(zzgdn.zzo(listenableFuture, (long) ((Integer) zzbd.zzc().zzb(zzbde.zzec)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
    }

    private final zzr zzm(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzr.zzc();
            }
            i = 0;
        }
        return new zzr(this.zza, new AdSize(i, i2));
    }
}
