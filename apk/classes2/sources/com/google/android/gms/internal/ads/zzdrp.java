package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdrp implements zzcza, zzcxm, zzcwb, zzdep {
    private final zzdsd zza;
    private final zzdso zzb;
    private final int zzc;

    zzdrp(zzdsd zzdsd, zzdso zzdso, int i) {
        this.zza = zzdsd;
        this.zzb = zzdso;
        this.zzc = i;
    }

    private final void zzc(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                long j = bundle.getLong(str);
                if (j >= 0) {
                    this.zza.zzd(str, String.valueOf(j));
                }
            }
        }
    }

    private final void zzd(Bundle bundle, zzfyq zzfyq) {
        String str;
        Bundle bundle2 = bundle;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue() && bundle2 != null) {
            bundle2.putLong(zzdrr.PUBLIC_API_CALLBACK.zza(), zzv.zzD().currentTimeMillis());
            zzdsd zzdsd = this.zza;
            zzdsd.zzc();
            String str2 = "0";
            if (bundle2.containsKey("ls")) {
                if (true != bundle2.getBoolean("ls")) {
                    str = str2;
                } else {
                    str = "1";
                }
                zzdsd.zzd("ls", str);
            }
            int size = zzfyq.size();
            for (int i = 0; i < size; i++) {
                zzdrs zzdrs = (zzdrs) zzfyq.get(i);
                long j = bundle2.getLong(zzdrs.zza().zza(), -1);
                long j2 = bundle2.getLong(zzdrs.zzb().zza(), -1);
                if (j > 0 && j2 > 0) {
                    zzdsd.zzd(zzdrs.zzc(), String.valueOf(j2 - j));
                }
            }
            zzc(bundle2.getBundle("client_sig_latency_key"));
            zzc(bundle2.getBundle("gms_sig_latency_key"));
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzhN)).booleanValue()) {
                if (bundle2.containsKey("sod_h")) {
                    if (true == bundle2.getBoolean("sod_h")) {
                        str2 = "1";
                    }
                    zzdsd.zzd("sod_h", str2);
                }
                if (bundle2.containsKey("cmr")) {
                    zzdsd.zzd("cmr", String.valueOf(bundle2.getInt("cmr")));
                }
            }
        }
    }

    public final void zzdD(zze zze) {
        zzdsd zzdsd = this.zza;
        zzdsd.zzb().put("action", "ftl");
        zzdsd.zzd("ftl", String.valueOf(zze.zza));
        zzdsd.zzd("ed", zze.zzc);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhv)).booleanValue()) {
            zzdsd.zzd("emsg", zze.zzb);
        }
        this.zzb.zzg(zzdsd.zzb());
    }

    public final void zzdn(zzbvq zzbvq) {
        this.zza.zzf(zzbvq.zza);
    }

    public final void zzdo(zzfcn zzfcn) {
        this.zza.zze(zzfcn);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzhg
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzhN
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.zzdsd r0 = r5.zza
            int r1 = r5.zzc
            java.util.Map r0 = r0.zzb()
            java.lang.String r2 = "sgw"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
        L_0x0036:
            java.lang.String r0 = "sgs"
            java.lang.String r1 = "action"
            if (r6 != 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzdsd r6 = r5.zza
            java.util.Map r2 = r6.zzb()
            r2.put(r1, r0)
            java.util.Map r0 = r6.zzb()
            java.lang.String r1 = "request_id"
            java.lang.String r2 = "-1"
            r0.put(r1, r2)
            com.google.android.gms.internal.ads.zzdso r0 = r5.zzb
            java.util.Map r6 = r6.zzb()
            r0.zzg(r6)
            return
        L_0x005a:
            com.google.android.gms.internal.ads.zzbvq r2 = r6.zzd
            android.os.Bundle r3 = r6.zze
            if (r2 == 0) goto L_0x0068
            android.os.Bundle r2 = r2.zzm
            com.google.android.gms.internal.ads.zzfyq r3 = com.google.android.gms.internal.ads.zzdrs.zza
            r5.zzd(r2, r3)
            goto L_0x0075
        L_0x0068:
            if (r3 == 0) goto L_0x0075
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x0075
            com.google.android.gms.internal.ads.zzfyq r2 = com.google.android.gms.internal.ads.zzdrs.zza
            r5.zzd(r3, r2)
        L_0x0075:
            java.lang.String r2 = r6.zzc     // Catch:{ JSONException -> 0x00e0 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x00e0 }
            if (r2 == 0) goto L_0x0080
            java.lang.String r2 = r6.zzb     // Catch:{ JSONException -> 0x00e0 }
            goto L_0x0082
        L_0x0080:
            java.lang.String r2 = r6.zzc     // Catch:{ JSONException -> 0x00e0 }
        L_0x0082:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e0 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x00e0 }
            com.google.android.gms.internal.ads.zzdsd r2 = r5.zza
            java.util.Map r4 = r2.zzb()
            r4.put(r1, r0)
            java.util.Map r0 = r2.zzb()
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzkd
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00c2
            java.lang.String r1 = "extras"
            org.json.JSONObject r1 = r3.getJSONObject(r1)     // Catch:{ JSONException -> 0x00ba }
            java.lang.String r2 = "accept_3p_cookie"
            boolean r1 = r1.getBoolean(r2)     // Catch:{ JSONException -> 0x00ba }
            if (r1 == 0) goto L_0x00b7
            java.lang.String r1 = "1"
            goto L_0x00c4
        L_0x00b7:
            java.lang.String r1 = "0"
            goto L_0x00c4
        L_0x00ba:
            r1 = move-exception
            int r2 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r2 = "Error retrieving JSONObject from the requestJson, "
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r1)
        L_0x00c2:
            java.lang.String r1 = "na"
        L_0x00c4:
            java.lang.String r2 = "tpc"
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzbvq r6 = r6.zzd
            if (r6 == 0) goto L_0x00d4
            com.google.android.gms.internal.ads.zzdsd r0 = r5.zza
            android.os.Bundle r6 = r6.zza
            r0.zzf(r6)
        L_0x00d4:
            com.google.android.gms.internal.ads.zzdso r6 = r5.zzb
            com.google.android.gms.internal.ads.zzdsd r0 = r5.zza
            java.util.Map r0 = r0.zzb()
            r6.zzg(r0)
            return
        L_0x00e0:
            com.google.android.gms.internal.ads.zzdsd r6 = r5.zza
            java.util.Map r0 = r6.zzb()
            java.lang.String r2 = "sgf"
            r0.put(r1, r2)
            java.util.Map r0 = r6.zzb()
            java.lang.String r1 = "sgf_reason"
            java.lang.String r2 = "request_invalid"
            r0.put(r1, r2)
            com.google.android.gms.internal.ads.zzdso r0 = r5.zzb
            java.util.Map r6 = r6.zzb()
            r0.zzg(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrp.zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk):void");
    }

    public final void zzf(String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzhg)).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzhN)).booleanValue()) {
                this.zza.zzb().put("sgw", String.valueOf(this.zzc));
            }
            zzdsd zzdsd = this.zza;
            zzdsd.zzb().put("action", "sgf");
            zzdsd.zzd("sgf_reason", str);
            this.zzb.zzg(zzdsd.zzb());
        }
    }

    public final void zzu() {
        String str;
        zzdsd zzdsd = this.zza;
        zzdsd.zzb().put("action", "loaded");
        zzd(zzdsd.zza(), zzdrs.zzb);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzmZ)).booleanValue()) {
            boolean isFeatureSupported = WebViewFeature.isFeatureSupported("MUTE_AUDIO");
            Map zzb2 = zzdsd.zzb();
            if (true != isFeatureSupported) {
                str = "0";
            } else {
                str = "1";
            }
            zzb2.put("mafe", str);
        }
        this.zzb.zzg(zzdsd.zzb());
    }
}
