package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdyb {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzche zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfcw zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfhu zzi;
    private final zzdsd zzj;
    private final zzfjy zzk;
    /* access modifiers changed from: private */
    public final zzcyy zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzbvy zzq;

    zzdyb(zzche zzche, Context context, VersionInfoParcel versionInfoParcel, zzfcw zzfcw, Executor executor, String str, zzfhu zzfhu, zzdsd zzdsd, zzbvy zzbvy, zzeag zzeag, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjy, zzcyy zzcyy) {
        this.zzb = zzche;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzfcw;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfhu;
        zzche.zzw();
        this.zzj = zzdsd;
        this.zzq = zzbvy;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfjy;
        this.zzl = zzcyy;
    }

    public static /* synthetic */ ListenableFuture zzb(zzdyb zzdyb, List list, Exception exc) {
        zzehf zzehf;
        zzv.zzp().zzv(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzehf = new zzehf(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzehf) {
            zzehf = (zzehf) exc;
        } else {
            zzehf = new zzehf(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzehf.getMessage() == null ? "" : zzehf.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List zzf2 = zzfwe.zzb(zzfva.zzc(':')).zzf(message);
                    if (zzf2.size() == 2) {
                        message = (String) zzf2.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfju.zzc(zzfju.zzc((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            zzdyb.zzk.zze(arrayList, (com.google.android.gms.ads.internal.util.client.zzv) null);
        }
        return zzgdn.zzg(zzehf);
    }

    public static /* synthetic */ ListenableFuture zzc(zzdyb zzdyb, JSONObject jSONObject) {
        zzfck zzfck = new zzfck(zzdyb.zze);
        String jSONObject2 = jSONObject.toString();
        return zzgdn.zzh(new zzfcn(zzfck, zzfcm.zza(new StringReader(jSONObject2), zzdyb.zzp)));
    }

    public static /* synthetic */ ListenableFuture zzd(zzdyb zzdyb, zzbom zzbom, JSONObject jSONObject) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcs)).booleanValue()) {
            zzdyb.zzj.zza().putLong(zzdrr.SCAR_PRELOADER_PROCESSING_DONE.zza(), zzv.zzD().currentTimeMillis());
        }
        return zzbom.zzb(jSONObject);
    }

    public static /* synthetic */ String zzf(zzdyb zzdyb, zzead zzead) {
        zzdyb.zzi(zzdrr.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i < ((Integer) zzbd.zzc().zzb(zzbde.zzht)).intValue()) {
                    zzead zzead2 = zzead;
                    zzeae zzb2 = new zzeaf(zzdyb.zzc, zzdyb.zzd.afmaVersion, zzdyb.zzq, Binder.getCallingUid()).zza(zzead);
                    zzeae zzeae = zzb2;
                    int i3 = zzb2.zza;
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzhu)).booleanValue()) {
                        zzdyb.zzj.zzd("fr", String.valueOf(i));
                    }
                    if (i3 == 200) {
                        zzdyb.zzi(zzdrr.RENDERING_ADSTRING_TYPE2_FETCH_END);
                        return zzb2.zzc;
                    }
                    i++;
                    i2 = i3;
                } else {
                    throw new zzehf(1, "Received HTTP error code from ad server:" + i2);
                }
            } catch (Exception e) {
                throw new zzehf(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.util.concurrent.ListenableFuture zzg(java.lang.String r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = ""
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            if (r2 == 0) goto L_0x0018
            com.google.android.gms.internal.ads.zzehf r1 = new com.google.android.gms.internal.ads.zzehf
            r2 = 15
            java.lang.String r3 = "Invalid ad string."
            r1.<init>(r2, r3)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzg(r1)
            return r1
        L_0x0018:
            android.content.Context r2 = r0.zzc
            r3 = 11
            com.google.android.gms.internal.ads.zzfhj r3 = com.google.android.gms.internal.ads.zzfhi.zza(r2, r3)
            r3.zzi()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r0.zzd
            com.google.android.gms.internal.ads.zzche r5 = r0.zzb
            com.google.android.gms.internal.ads.zzbon r6 = com.google.android.gms.ads.internal.zzv.zzg()
            com.google.android.gms.internal.ads.zzfhx r5 = r5.zzy()
            com.google.android.gms.internal.ads.zzbow r2 = r6.zza(r2, r4, r5)
            java.lang.String r4 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.zzboq r5 = com.google.android.gms.internal.ads.zzbot.zza
            com.google.android.gms.internal.ads.zzbom r2 = r2.zza(r4, r5, r5)
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzhp
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = "1"
            java.lang.String r6 = "sst"
            if (r4 == 0) goto L_0x0149
            r4 = 0
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0079 }
            r8 = r18
            r7.<init>(r8)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r9 = "fetch_url"
            java.lang.String r9 = r7.optString(r9, r1)     // Catch:{ JSONException -> 0x007b }
            r0.zzn = r9     // Catch:{ JSONException -> 0x007b }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007b }
            java.lang.String r10 = "settings"
            java.lang.String r7 = r7.optString(r10, r1)     // Catch:{ JSONException -> 0x007b }
            r9.<init>(r7)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r7 = "nofill_urls"
            org.json.JSONArray r7 = r9.getJSONArray(r7)     // Catch:{ JSONException -> 0x007b }
            java.util.List r7 = com.google.android.gms.ads.internal.util.zzbs.zzc(r7, r4)     // Catch:{ JSONException -> 0x007b }
            r0.zzo = r7     // Catch:{ JSONException -> 0x007b }
            goto L_0x0082
        L_0x0079:
            r8 = r18
        L_0x007b:
            int r7 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r7 = "Invalid ad response."
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r7)
        L_0x0082:
            java.lang.String r7 = r0.zzn
            java.util.List r9 = r0.zzo
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 != 0) goto L_0x013f
            com.google.android.gms.internal.ads.zzdsd r5 = r0.zzj
            java.lang.String r8 = "2"
            r5.zzd(r6, r8)
            com.google.android.gms.internal.ads.zzbcv r5 = com.google.android.gms.internal.ads.zzbde.zzhr
            com.google.android.gms.internal.ads.zzbdc r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r6.zzb(r5)
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15
            com.google.android.gms.internal.ads.zzbcv r5 = com.google.android.gms.internal.ads.zzbde.zzhq
            com.google.android.gms.internal.ads.zzbdc r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r6.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00ee
            java.util.regex.Pattern r1 = zza
            com.google.android.gms.internal.ads.zzfwe r1 = com.google.android.gms.internal.ads.zzfwe.zzc(r1)
            java.util.List r1 = r1.zzf(r7)
            int r5 = r1.size()
            r6 = 2
            r8 = 1
            if (r5 >= r6) goto L_0x00d1
            com.google.android.gms.internal.ads.zzehf r1 = new com.google.android.gms.internal.ads.zzehf
            java.lang.String r4 = "Invalid fetch URL."
            r1.<init>(r8, r4)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzg(r1)
            goto L_0x0154
        L_0x00d1:
            java.lang.Object r1 = r1.get(r8)
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.ads.internal.zzv.zzr()
            android.net.Uri r5 = android.net.Uri.parse(r7)
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r4 = r5.query(r4)
            android.net.Uri r4 = r4.build()
            java.lang.String r7 = r4.toString()
        L_0x00ee:
            r11 = r7
            com.google.android.gms.internal.ads.zzead r4 = new com.google.android.gms.internal.ads.zzead
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r14 = r1.getBytes(r5)
            r16 = 0
            r12 = 60000(0xea60, float:8.4078E-41)
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            com.google.android.gms.internal.ads.zzgdy r1 = com.google.android.gms.internal.ads.zzcaf.zza
            com.google.android.gms.internal.ads.zzdxy r5 = new com.google.android.gms.internal.ads.zzdxy
            r5.<init>(r0, r4)
            com.google.common.util.concurrent.ListenableFuture r1 = r1.zzb(r5)
            com.google.android.gms.internal.ads.zzgde r1 = com.google.android.gms.internal.ads.zzgde.zzw(r1)
            com.google.android.gms.internal.ads.zzbcv r4 = com.google.android.gms.internal.ads.zzbde.zzhs
            com.google.android.gms.internal.ads.zzbdc r5 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r4 = (long) r4
            java.util.concurrent.ScheduledExecutorService r6 = r0.zzg
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzo(r1, r4, r7, r6)
            com.google.android.gms.internal.ads.zzgde r1 = (com.google.android.gms.internal.ads.zzgde) r1
            com.google.android.gms.internal.ads.zzdxz r4 = new com.google.android.gms.internal.ads.zzdxz
            r4.<init>(r0, r9)
            java.util.concurrent.Executor r5 = r0.zzf
            java.lang.Class<java.lang.Exception> r6 = java.lang.Exception.class
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzf(r1, r6, r4, r5)
            com.google.android.gms.internal.ads.zzgde r1 = (com.google.android.gms.internal.ads.zzgde) r1
            goto L_0x0154
        L_0x013f:
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzh(r18)
            com.google.android.gms.internal.ads.zzdsd r4 = r0.zzj
            r4.zzd(r6, r5)
            goto L_0x0154
        L_0x0149:
            r8 = r18
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzh(r18)
            com.google.android.gms.internal.ads.zzdsd r4 = r0.zzj
            r4.zzd(r6, r5)
        L_0x0154:
            com.google.android.gms.internal.ads.zzdxv r4 = new com.google.android.gms.internal.ads.zzdxv
            r5 = r19
            r4.<init>(r0, r5)
            java.util.concurrent.Executor r5 = r0.zzf
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzn(r1, r4, r5)
            com.google.android.gms.internal.ads.zzdxw r4 = new com.google.android.gms.internal.ads.zzdxw
            r4.<init>(r0, r2)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzn(r1, r4, r5)
            com.google.android.gms.internal.ads.zzdxx r2 = new com.google.android.gms.internal.ads.zzdxx
            r2.<init>(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = com.google.android.gms.internal.ads.zzgdn.zzn(r1, r2, r5)
            com.google.android.gms.internal.ads.zzfhu r2 = r0.zzi
            com.google.android.gms.internal.ads.zzfht.zza(r1, r2, r3)
            com.google.android.gms.internal.ads.zzdya r2 = new com.google.android.gms.internal.ads.zzdya
            r2.<init>(r0)
            com.google.android.gms.internal.ads.zzgdy r3 = com.google.android.gms.internal.ads.zzcaf.zzg
            com.google.android.gms.internal.ads.zzgdn.zzr(r1, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyb.zzg(java.lang.String, java.lang.String):com.google.common.util.concurrent.ListenableFuture");
    }

    private final String zzh(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String concat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = zze.zza;
            zzo.zzj(concat);
            return str;
        }
    }

    private final void zzi(zzdrr zzdrr) {
        Bundle zza2 = this.zzj.zza();
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhu)).booleanValue()) {
            zza2.putLong(zzdrr.zza(), zzv.zzD().currentTimeMillis());
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022e, code lost:
        if (r5.zzg(r1, r2, r4) == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0238, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0243, code lost:
        return zzg(r0, zzh(r7));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ec A[Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x0156 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f6 A[Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x0156 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021b A[Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x0156 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x022a A[Catch:{ UnsupportedEncodingException | IllegalArgumentException -> 0x0156 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.ListenableFuture zze() {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzcs
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzfcw r0 = r13.zze
            android.os.Bundle r0 = r0.zzs
            r13.zzp = r0
            com.google.android.gms.internal.ads.zzdsd r0 = r13.zzj
            android.os.Bundle r0 = r0.zza()
            com.google.android.gms.internal.ads.zzdrr r1 = com.google.android.gms.internal.ads.zzdrr.SCAR_PRELOADER_READY
            java.lang.String r1 = r1.zza()
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.ads.internal.zzv.zzD()
            long r2 = r2.currentTimeMillis()
            r0.putLong(r1, r2)
        L_0x002f:
            com.google.android.gms.internal.ads.zzfcw r0 = r13.zze
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            java.lang.String r0 = r0.zzx
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0247
            java.lang.String r1 = zzj(r0)
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzhl
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r3.zzb(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            if (r3 == 0) goto L_0x0069
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0069
            java.lang.String r1 = "&request_id="
            int r1 = r0.lastIndexOf(r1)
            if (r1 == r4) goto L_0x0067
            int r1 = r1 + 12
            java.lang.String r1 = r0.substring(r1)
            goto L_0x0069
        L_0x0067:
            java.lang.String r1 = ""
        L_0x0069:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x007d
            com.google.android.gms.internal.ads.zzehf r0 = new com.google.android.gms.internal.ads.zzehf
            r1 = 15
            java.lang.String r2 = "Invalid ad string."
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgdn.zzg(r0)
            return r0
        L_0x007d:
            java.lang.Object r3 = r13.zzm
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzche r5 = r13.zzb     // Catch:{ all -> 0x0244 }
            com.google.android.gms.ads.nonagon.signalgeneration.zzv r5 = r5.zzn()     // Catch:{ all -> 0x0244 }
            com.google.android.gms.internal.ads.zzdsd r6 = r13.zzj     // Catch:{ all -> 0x0244 }
            java.lang.String r7 = r5.zzb(r1, r6)     // Catch:{ all -> 0x0244 }
            com.google.android.gms.internal.ads.zzbdc r8 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0244 }
            java.lang.Object r2 = r8.zzb(r2)     // Catch:{ all -> 0x0244 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0244 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0244 }
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x016f
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0244 }
            if (r2 != 0) goto L_0x016f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x016f }
            r2.<init>(r7)     // Catch:{ JSONException -> 0x016f }
            java.lang.String r10 = "extras"
            org.json.JSONObject r2 = r2.optJSONObject(r10)     // Catch:{ JSONException -> 0x016f }
            if (r2 == 0) goto L_0x016f
            java.lang.String r10 = "query_info_type"
            java.lang.String r11 = ""
            java.lang.String r2 = r2.optString(r10, r11)     // Catch:{ JSONException -> 0x016f }
            com.google.android.gms.internal.ads.zzbcv r10 = com.google.android.gms.internal.ads.zzbde.zzhn     // Catch:{ JSONException -> 0x016f }
            com.google.android.gms.internal.ads.zzbdc r11 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ JSONException -> 0x016f }
            java.lang.Object r10 = r11.zzb(r10)     // Catch:{ JSONException -> 0x016f }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ JSONException -> 0x016f }
            boolean r10 = r10.booleanValue()     // Catch:{ JSONException -> 0x016f }
            if (r10 == 0) goto L_0x00e2
            com.google.android.gms.internal.ads.zzbcv r10 = com.google.android.gms.internal.ads.zzbde.zzho     // Catch:{ JSONException -> 0x016f }
            com.google.android.gms.internal.ads.zzbdc r11 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ JSONException -> 0x016f }
            java.lang.Object r10 = r11.zzb(r10)     // Catch:{ JSONException -> 0x016f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ JSONException -> 0x016f }
            java.lang.String r11 = ","
            java.lang.String[] r10 = r10.split(r11)     // Catch:{ JSONException -> 0x016f }
            java.util.List r10 = java.util.Arrays.asList(r10)     // Catch:{ JSONException -> 0x016f }
            goto L_0x00f8
        L_0x00e2:
            com.google.android.gms.internal.ads.zzbcv r10 = com.google.android.gms.internal.ads.zzbde.zzhm     // Catch:{ JSONException -> 0x016f }
            com.google.android.gms.internal.ads.zzbdc r11 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ JSONException -> 0x016f }
            java.lang.Object r10 = r11.zzb(r10)     // Catch:{ JSONException -> 0x016f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ JSONException -> 0x016f }
            java.lang.String r11 = ","
            java.lang.String[] r10 = r10.split(r11)     // Catch:{ JSONException -> 0x016f }
            java.util.List r10 = java.util.Arrays.asList(r10)     // Catch:{ JSONException -> 0x016f }
        L_0x00f8:
            java.lang.String r2 = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(r2)     // Catch:{ JSONException -> 0x016f }
            boolean r2 = r10.contains(r2)     // Catch:{ JSONException -> 0x016f }
            if (r2 != 0) goto L_0x0104
            goto L_0x016f
        L_0x0104:
            java.lang.String r2 = "&"
            int r2 = r0.lastIndexOf(r2)     // Catch:{ all -> 0x0244 }
            if (r2 == r4) goto L_0x0111
            java.lang.String r2 = r0.substring(r9, r2)     // Catch:{ all -> 0x0244 }
            goto L_0x0112
        L_0x0111:
            r2 = r8
        L_0x0112:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0244 }
            if (r4 == 0) goto L_0x0119
            goto L_0x016f
        L_0x0119:
            r4 = 11
            byte[] r2 = android.util.Base64.decode(r2, r4)     // Catch:{ UnsupportedEncodingException -> 0x0158, IllegalArgumentException -> 0x0156 }
            java.lang.String r4 = "UTF-8"
            byte[] r4 = r1.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x0158, IllegalArgumentException -> 0x0156 }
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch:{ UnsupportedEncodingException -> 0x0158, IllegalArgumentException -> 0x0156 }
            if (r10 == 0) goto L_0x012d
        L_0x012b:
            r10 = r8
            goto L_0x0151
        L_0x012d:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0139 }
            r10.<init>(r7)     // Catch:{ JSONException -> 0x0139 }
            java.lang.String r11 = "arek"
            java.lang.String r10 = r10.getString(r11)     // Catch:{ JSONException -> 0x0139 }
            goto L_0x0151
        L_0x0139:
            r10 = move-exception
            java.lang.String r11 = r10.toString()     // Catch:{ UnsupportedEncodingException -> 0x0158, IllegalArgumentException -> 0x0156 }
            java.lang.String r12 = "Failed to get key from QueryJSONMap"
            java.lang.String r11 = r12.concat(r11)     // Catch:{ UnsupportedEncodingException -> 0x0158, IllegalArgumentException -> 0x0156 }
            com.google.android.gms.ads.internal.util.zze.zza(r11)     // Catch:{ UnsupportedEncodingException -> 0x0158, IllegalArgumentException -> 0x0156 }
            com.google.android.gms.internal.ads.zzbzs r11 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ UnsupportedEncodingException -> 0x0158, IllegalArgumentException -> 0x0156 }
            java.lang.String r12 = "CryptoUtils.getKeyFromQueryJsonMap"
            r11.zzw(r10, r12)     // Catch:{ UnsupportedEncodingException -> 0x0158, IllegalArgumentException -> 0x0156 }
            goto L_0x012b
        L_0x0151:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfdl.zzb(r2, r4, r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x0158, IllegalArgumentException -> 0x0156 }
            goto L_0x016f
        L_0x0156:
            r2 = move-exception
            goto L_0x0159
        L_0x0158:
            r2 = move-exception
        L_0x0159:
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0244 }
            java.lang.String r6 = "Failed to decode the adResponse. "
            java.lang.String r4 = r6.concat(r4)     // Catch:{ all -> 0x0244 }
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch:{ all -> 0x0244 }
            com.google.android.gms.internal.ads.zzbzs r4 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x0244 }
            java.lang.String r6 = "PreloadedLoader.decryptAdResponseIfNecessary"
            r4.zzw(r2, r6)     // Catch:{ all -> 0x0244 }
        L_0x016f:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0244 }
            if (r2 == 0) goto L_0x0178
            java.lang.String r2 = ""
            goto L_0x0188
        L_0x0178:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0186 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r4 = "render_id"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.optString(r4, r6)     // Catch:{ all -> 0x0244 }
            goto L_0x0188
        L_0x0186:
            java.lang.String r2 = ""
        L_0x0188:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0244 }
            if (r4 != 0) goto L_0x01e9
            java.lang.String r4 = ""
            java.lang.String r6 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x019d }
            byte[] r10 = android.util.Base64.decode(r2, r9)     // Catch:{ IllegalArgumentException -> 0x019d }
            java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IllegalArgumentException -> 0x019d }
            r6.<init>(r10, r11)     // Catch:{ IllegalArgumentException -> 0x019d }
            r4 = r6
            goto L_0x01b4
        L_0x019d:
            r6 = move-exception
            java.lang.String r10 = "Ad grouping: Has render_id, but not base64 encoded: "
            java.lang.String r11 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0244 }
            java.lang.String r10 = r10.concat(r11)     // Catch:{ all -> 0x0244 }
            com.google.android.gms.ads.internal.util.zze.zza(r10)     // Catch:{ all -> 0x0244 }
            com.google.android.gms.internal.ads.zzbzs r10 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ all -> 0x0244 }
            java.lang.String r11 = "PreloadedLoader.decodeRenderId"
            r10.zzw(r6, r11)     // Catch:{ all -> 0x0244 }
        L_0x01b4:
            r6 = 58
            com.google.android.gms.internal.ads.zzfva r6 = com.google.android.gms.internal.ads.zzfva.zzc(r6)     // Catch:{ all -> 0x0244 }
            com.google.android.gms.internal.ads.zzfwe r6 = com.google.android.gms.internal.ads.zzfwe.zzb(r6)     // Catch:{ all -> 0x0244 }
            java.util.List r4 = r6.zzf(r4)     // Catch:{ all -> 0x0244 }
            int r6 = r4.size()     // Catch:{ all -> 0x0244 }
            r10 = 2
            if (r6 != r10) goto L_0x01dc
            java.lang.Object r2 = r4.get(r9)     // Catch:{ all -> 0x0244 }
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0244 }
            r2 = 1
            java.lang.Object r2 = r4.get(r2)     // Catch:{ all -> 0x0244 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0244 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0244 }
            goto L_0x01ea
        L_0x01dc:
            java.lang.String r4 = "Ad grouping: Has render_id, but invalid format: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0244 }
            java.lang.String r2 = r4.concat(r2)     // Catch:{ all -> 0x0244 }
            com.google.android.gms.ads.internal.util.zze.zza(r2)     // Catch:{ all -> 0x0244 }
        L_0x01e9:
            r2 = r9
        L_0x01ea:
            if (r8 == 0) goto L_0x01f6
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0244 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0244 }
            r4.<init>(r8, r2)     // Catch:{ all -> 0x0244 }
            goto L_0x0201
        L_0x01f6:
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0244 }
            java.lang.String r2 = ""
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0244 }
            r4.<init>(r2, r6)     // Catch:{ all -> 0x0244 }
        L_0x0201:
            java.lang.Object r2 = r4.first     // Catch:{ all -> 0x0244 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0244 }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x0244 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0244 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0244 }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0244 }
            if (r6 != 0) goto L_0x0230
            if (r4 <= 0) goto L_0x0230
            boolean r6 = r5.zzh(r1, r2)     // Catch:{ all -> 0x0244 }
            if (r6 == 0) goto L_0x022a
            com.google.android.gms.internal.ads.zzehf r0 = new com.google.android.gms.internal.ads.zzehf     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = "The ad has already been shown."
            r2 = 10
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0244 }
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgdn.zzg(r0)     // Catch:{ all -> 0x0244 }
            monitor-exit(r3)     // Catch:{ all -> 0x0244 }
            return r0
        L_0x022a:
            boolean r2 = r5.zzg(r1, r2, r4)     // Catch:{ all -> 0x0244 }
            if (r2 != 0) goto L_0x0233
        L_0x0230:
            r5.zzf(r1)     // Catch:{ all -> 0x0244 }
        L_0x0233:
            monitor-exit(r3)     // Catch:{ all -> 0x0244 }
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L_0x023b
            goto L_0x0247
        L_0x023b:
            java.lang.String r1 = r13.zzh(r7)
            com.google.common.util.concurrent.ListenableFuture r0 = r13.zzg(r0, r1)
            return r0
        L_0x0244:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0244 }
            throw r0
        L_0x0247:
            com.google.android.gms.internal.ads.zzfcw r0 = r13.zze
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs
            if (r0 == 0) goto L_0x02a8
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzhd
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0262
            goto L_0x028e
        L_0x0262:
            java.lang.String r1 = r0.zza
            java.lang.String r2 = r0.zzb
            java.lang.String r1 = zzj(r1)
            java.lang.String r2 = zzj(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x029b
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x029b
            com.google.android.gms.internal.ads.zzche r2 = r13.zzb
            com.google.android.gms.ads.nonagon.signalgeneration.zzv r2 = r2.zzn()
            r2.zzf(r1)
            com.google.android.gms.internal.ads.zzdsd r2 = r13.zzj
            java.util.Map r2 = r2.zzb()
            java.lang.String r3 = "request_id"
            r2.put(r3, r1)
        L_0x028e:
            java.lang.String r1 = r0.zza
            java.lang.String r0 = r0.zzb
            java.lang.String r0 = r13.zzh(r0)
            com.google.common.util.concurrent.ListenableFuture r0 = r13.zzg(r1, r0)
            return r0
        L_0x029b:
            com.google.android.gms.internal.ads.zzdsd r0 = r13.zzj
            java.util.Map r0 = r0.zzb()
            java.lang.String r1 = "ridmm"
            java.lang.String r2 = "true"
            r0.put(r1, r2)
        L_0x02a8:
            com.google.android.gms.internal.ads.zzehf r0 = new com.google.android.gms.internal.ads.zzehf
            r1 = 14
            java.lang.String r2 = "Mismatch request IDs."
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgdn.zzg(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyb.zze():com.google.common.util.concurrent.ListenableFuture");
    }
}
