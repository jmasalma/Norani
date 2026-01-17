package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzfsa;
import com.google.android.gms.internal.ads.zzfse;
import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfsg;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzad {
    public static Bundle zza(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return zzb(context, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle zzb(android.content.Context r10, java.lang.String r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 == 0) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x0018
        L_0x0009:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x000f }
            r0.<init>(r11)     // Catch:{ JSONException -> 0x000f }
            goto L_0x0018
        L_0x000f:
            r11 = move-exception
            int r0 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r0 = "JSON parsing error"
            com.google.android.gms.ads.internal.util.client.zzo.zzf(r0, r11)
            goto L_0x0007
        L_0x0018:
            if (r0 != 0) goto L_0x001d
            android.os.Bundle r10 = android.os.Bundle.EMPTY
            return r10
        L_0x001d:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            r2 = 0
            r3 = r2
        L_0x0024:
            int r4 = r0.length()
            if (r3 >= r4) goto L_0x00f3
            org.json.JSONObject r4 = r0.optJSONObject(r3)
            java.lang.String r5 = "bk"
            java.lang.String r5 = r4.optString(r5)
            java.lang.String r6 = "sk"
            java.lang.String r6 = r4.optString(r6)
            java.lang.String r7 = "type"
            r8 = -1
            int r4 = r4.optInt(r7, r8)
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x004f
            if (r4 == r8) goto L_0x004d
            if (r4 == r7) goto L_0x004b
            r4 = r2
            goto L_0x0050
        L_0x004b:
            r4 = 3
            goto L_0x0050
        L_0x004d:
            r4 = r7
            goto L_0x0050
        L_0x004f:
            r4 = r8
        L_0x0050:
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 != 0) goto L_0x00ef
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 != 0) goto L_0x00ef
            if (r4 != 0) goto L_0x0060
            goto L_0x00ef
        L_0x0060:
            r9 = 47
            com.google.android.gms.internal.ads.zzfva r9 = com.google.android.gms.internal.ads.zzfva.zzc(r9)
            com.google.android.gms.internal.ads.zzfwe r9 = com.google.android.gms.internal.ads.zzfwe.zzb(r9)
            java.util.List r6 = r9.zzf(r6)
            int r9 = r6.size()
            if (r9 > r7) goto L_0x00a5
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L_0x007b
            goto L_0x00a5
        L_0x007b:
            int r7 = r6.size()
            if (r7 != r8) goto L_0x008c
            android.content.SharedPreferences r7 = android.preference.PreferenceManager.getDefaultSharedPreferences(r10)
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x009c
        L_0x008c:
            java.lang.Object r7 = r6.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            android.content.SharedPreferences r7 = r10.getSharedPreferences(r7, r2)
            java.lang.Object r6 = r6.get(r8)
            java.lang.String r6 = (java.lang.String) r6
        L_0x009c:
            java.util.Map r7 = r7.getAll()
            java.lang.Object r6 = r7.get(r6)
            goto L_0x00a6
        L_0x00a5:
            r6 = r1
        L_0x00a6:
            if (r6 == 0) goto L_0x00ef
            int r4 = r4 + -1
            if (r4 == 0) goto L_0x00e6
            if (r4 == r8) goto L_0x00bc
            boolean r4 = r6 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x00ef
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            r11.putBoolean(r5, r4)
            goto L_0x00ef
        L_0x00bc:
            boolean r4 = r6 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x00ca
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r4 = r6.intValue()
            r11.putInt(r5, r4)
            goto L_0x00ef
        L_0x00ca:
            boolean r4 = r6 instanceof java.lang.Long
            if (r4 == 0) goto L_0x00d8
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r11.putLong(r5, r6)
            goto L_0x00ef
        L_0x00d8:
            boolean r4 = r6 instanceof java.lang.Float
            if (r4 == 0) goto L_0x00ef
            java.lang.Float r6 = (java.lang.Float) r6
            float r4 = r6.floatValue()
            r11.putFloat(r5, r4)
            goto L_0x00ef
        L_0x00e6:
            boolean r4 = r6 instanceof java.lang.String
            if (r4 == 0) goto L_0x00ef
            java.lang.String r6 = (java.lang.String) r6
            r11.putString(r5, r6)
        L_0x00ef:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x00f3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzad.zzb(android.content.Context, java.lang.String):android.os.Bundle");
    }

    public static void zzc(Context context) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgv)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzfse zzj = zzfse.zzj(context);
            zzfsf zzi = zzfsf.zzi(context);
            zzfsg zza = zzfsg.zza(context);
            zzj.zzk();
            zzj.zzl();
            zzi.zzj();
            zza.zzb((zzfsa) null);
        } catch (IOException e) {
            zzv.zzp().zzw(e, "clearStorageOnIdlessMode");
        }
        try {
            if (!context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e2) {
            zzv.zzp().zzw(e2, "clearStorageOnIdlessMode_scar");
        }
    }
}
