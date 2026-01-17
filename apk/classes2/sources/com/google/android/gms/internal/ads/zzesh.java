package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzesh implements zzeub {
    private final zzfcw zza;
    private final PackageInfo zzb;
    private final zzg zzc;

    public zzesh(zzfcw zzfcw, PackageInfo packageInfo, zzg zzg) {
        this.zza = zzfcw;
        this.zzb = packageInfo;
        this.zzc = zzg;
    }

    private final void zzc(Bundle bundle) {
        int i;
        zzbge zzbge = this.zza.zzi;
        if (zzbge != null && (i = zzbge.zzi) != 0) {
            bundle.putBoolean("sccg_tap", zzbge.zzj);
            bundle.putInt("sccg_dir", i);
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ArrayList arrayList = this.zza.zzg;
        zzcva zzcva = (zzcva) obj;
        if (arrayList != null && !arrayList.isEmpty()) {
            zzc(zzcva.zzb);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00df, code lost:
        if (r0 == 3) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r13) {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzfcw r0 = r12.zza
            java.util.ArrayList r1 = r0.zzg
            com.google.android.gms.internal.ads.zzcva r13 = (com.google.android.gms.internal.ads.zzcva) r13
            if (r1 != 0) goto L_0x000a
            goto L_0x0154
        L_0x000a:
            boolean r2 = r1.isEmpty()
            r3 = 0
            java.lang.String r4 = "native_version"
            if (r2 == 0) goto L_0x0019
            android.os.Bundle r13 = r13.zza
            r13.putInt(r4, r3)
            return
        L_0x0019:
            android.os.Bundle r13 = r13.zza
            r2 = 3
            r13.putInt(r4, r2)
            java.lang.String r4 = "native_templates"
            r13.putStringArrayList(r4, r1)
            java.util.ArrayList r1 = r0.zzh
            java.lang.String r4 = "native_custom_templates"
            r13.putStringArrayList(r4, r1)
            com.google.android.gms.internal.ads.zzbge r1 = r0.zzi
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x008b
            int r6 = r1.zza
            java.lang.String r7 = "landscape"
            java.lang.String r8 = "portrait"
            java.lang.String r9 = "any"
            java.lang.String r10 = "unknown"
            if (r6 <= r2) goto L_0x0062
            java.lang.String r6 = "enable_native_media_orientation"
            r13.putBoolean(r6, r5)
            int r6 = r1.zzh
            if (r6 == r5) goto L_0x0056
            if (r6 == r4) goto L_0x0054
            if (r6 == r2) goto L_0x0052
            r11 = 4
            if (r6 == r11) goto L_0x004f
            r6 = r10
            goto L_0x0057
        L_0x004f:
            java.lang.String r6 = "square"
            goto L_0x0057
        L_0x0052:
            r6 = r8
            goto L_0x0057
        L_0x0054:
            r6 = r7
            goto L_0x0057
        L_0x0056:
            r6 = r9
        L_0x0057:
            boolean r11 = r10.equals(r6)
            if (r11 != 0) goto L_0x0062
            java.lang.String r11 = "native_media_orientation"
            r13.putString(r11, r6)
        L_0x0062:
            int r6 = r1.zzc
            if (r6 == 0) goto L_0x006e
            if (r6 == r5) goto L_0x006c
            if (r6 == r4) goto L_0x006f
            r7 = r10
            goto L_0x006f
        L_0x006c:
            r7 = r8
            goto L_0x006f
        L_0x006e:
            r7 = r9
        L_0x006f:
            boolean r6 = r10.equals(r7)
            if (r6 != 0) goto L_0x007a
            java.lang.String r6 = "native_image_orientation"
            r13.putString(r6, r7)
        L_0x007a:
            boolean r6 = r1.zzd
            java.lang.String r7 = "native_multiple_images"
            r13.putBoolean(r7, r6)
            boolean r6 = r1.zzg
            java.lang.String r7 = "use_custom_mute"
            r13.putBoolean(r7, r6)
            r12.zzc(r13)
        L_0x008b:
            android.content.pm.PackageInfo r6 = r12.zzb
            if (r6 != 0) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            int r3 = r6.versionCode
        L_0x0092:
            com.google.android.gms.ads.internal.util.zzg r6 = r12.zzc
            int r7 = r6.zza()
            if (r3 <= r7) goto L_0x00a0
            r6.zzq()
            r6.zzt(r3)
        L_0x00a0:
            org.json.JSONObject r3 = r6.zzn()
            r6 = 0
            if (r3 == 0) goto L_0x00b3
            java.lang.String r7 = r0.zzf
            org.json.JSONArray r3 = r3.optJSONArray(r7)
            if (r3 == 0) goto L_0x00b3
            java.lang.String r6 = r3.toString()
        L_0x00b3:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x00be
            java.lang.String r3 = "native_advanced_settings"
            r13.putString(r3, r6)
        L_0x00be:
            int r3 = r0.zzk
            if (r3 <= r5) goto L_0x00c7
            java.lang.String r6 = "max_num_ads"
            r13.putInt(r6, r3)
        L_0x00c7:
            com.google.android.gms.internal.ads.zzbmp r0 = r0.zzb
            if (r0 == 0) goto L_0x010f
            java.lang.String r3 = r0.zzc
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L_0x0105
            int r3 = r0.zza
            java.lang.String r6 = "p"
            java.lang.String r7 = "l"
            if (r3 < r4) goto L_0x00e2
            int r0 = r0.zzd
            if (r0 == r4) goto L_0x00fe
            if (r0 == r2) goto L_0x00ff
            goto L_0x00fe
        L_0x00e2:
            int r0 = r0.zzb
            if (r0 == r5) goto L_0x00fe
            if (r0 == r4) goto L_0x00ff
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Instream ad video aspect ratio "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " is wrong."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r0)
        L_0x00fe:
            r6 = r7
        L_0x00ff:
            java.lang.String r0 = "ia_var"
            r13.putString(r0, r6)
            goto L_0x010a
        L_0x0105:
            java.lang.String r0 = "ad_tag"
            r13.putString(r0, r3)
        L_0x010a:
            java.lang.String r0 = "instr"
            r13.putBoolean(r0, r5)
        L_0x010f:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzmn
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0154
            if (r1 == 0) goto L_0x0154
            com.google.android.gms.ads.internal.client.zzgc r0 = r1.zzf
            if (r0 == 0) goto L_0x0146
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "startMuted"
            boolean r4 = r0.zza
            r2.putBoolean(r3, r4)
            java.lang.String r3 = "clickToExpandRequested"
            boolean r4 = r0.zzc
            r2.putBoolean(r3, r4)
            java.lang.String r3 = "customControlsRequested"
            boolean r0 = r0.zzb
            r2.putBoolean(r3, r0)
            java.lang.String r0 = "video"
            r13.putBundle(r0, r2)
        L_0x0146:
            boolean r0 = r1.zzb
            java.lang.String r2 = "disable_image_loading"
            r13.putBoolean(r2, r0)
            int r0 = r1.zze
            java.lang.String r1 = "preferred_ad_choices_position"
            r13.putInt(r1, r0)
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesh.zzb(java.lang.Object):void");
    }
}
