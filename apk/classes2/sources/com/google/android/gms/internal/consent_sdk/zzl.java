package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class zzl {
    private final zzam zza;
    private final Context zzb;

    zzl(Application application, zzam zzam) {
        this.zza = zzam;
        this.zzb = application.getApplicationContext();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.util.Map r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.consent_sdk.zzam r2 = r0.zza
            boolean r3 = r2.zzd()
            if (r3 != 0) goto L_0x000d
            return
        L_0x000d:
            android.content.Context r3 = r0.zzb
            r2.zzb(r3)
            java.lang.String r3 = "IABTCF_gdprApplies"
            java.lang.Object r4 = r1.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r6 = r17.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0027:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0113
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r7.equals(r3)
            if (r8 != 0) goto L_0x0027
            int r8 = r7.hashCode()
            r9 = 3
            r10 = -1
            r11 = 2
            r12 = 1
            switch(r8) {
                case -1926457382: goto L_0x0063;
                case -142866440: goto L_0x0059;
                case 1068702385: goto L_0x004f;
                case 1479307131: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x006d
        L_0x0045:
            java.lang.String r8 = "UMP_CoMoAdUserDataPurposeConsentStatus"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x006d
            r8 = r12
            goto L_0x006e
        L_0x004f:
            java.lang.String r8 = "UMP_CoMoAdStoragePurposeConsentStatus"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x006d
            r8 = 0
            goto L_0x006e
        L_0x0059:
            java.lang.String r8 = "UMP_CoMoAnalyticsStoragePurposeConsentStatus"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x006d
            r8 = r9
            goto L_0x006e
        L_0x0063:
            java.lang.String r8 = "UMP_CoMoAdPersonalizationPurposeConsentStatus"
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x006d
            r8 = r11
            goto L_0x006e
        L_0x006d:
            r8 = r10
        L_0x006e:
            java.lang.String r13 = "AD_PERSONALIZATION"
            java.lang.String r14 = "AD_USER_DATA"
            if (r8 == 0) goto L_0x0088
            if (r8 == r12) goto L_0x0084
            if (r8 == r11) goto L_0x0080
            if (r8 == r9) goto L_0x007b
            goto L_0x0027
        L_0x007b:
            java.lang.String r8 = "google_analytics_default_allow_analytics_storage"
            java.lang.String r9 = "ANALYTICS_STORAGE"
            goto L_0x008c
        L_0x0080:
            java.lang.String r8 = "google_analytics_default_allow_ad_personalization_signals"
            r9 = r13
            goto L_0x008c
        L_0x0084:
            java.lang.String r8 = "google_analytics_default_allow_ad_user_data"
            r9 = r14
            goto L_0x008c
        L_0x0088:
            java.lang.String r8 = "google_analytics_default_allow_ad_storage"
            java.lang.String r9 = "AD_STORAGE"
        L_0x008c:
            java.lang.Object r7 = r1.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 == r10) goto L_0x0027
            java.lang.String r10 = "GRANTED"
            if (r7 == r12) goto L_0x010e
            java.lang.String r15 = "DENIED"
            if (r7 == r11) goto L_0x0109
            r11 = 4
            if (r7 == r11) goto L_0x0027
            r11 = 5
            java.lang.String r12 = "UserMessagingPlatform"
            if (r7 == r11) goto L_0x00bb
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Invalid CoMo consent status: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r12, r7)
            goto L_0x0027
        L_0x00bb:
            java.lang.Object r7 = r2.zza(r8)
            if (r7 != 0) goto L_0x00c8
            java.lang.String r7 = "No default metadata"
            android.util.Log.w(r12, r7)
            goto L_0x0027
        L_0x00c8:
            boolean r8 = r7 instanceof java.lang.Boolean
            if (r8 == 0) goto L_0x00db
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 1
            if (r8 == r7) goto L_0x00d6
            r10 = r15
        L_0x00d6:
            r5.put(r9, r10)
            goto L_0x0027
        L_0x00db:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L_0x0102
            java.lang.String r8 = "eu_consent_policy"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0102
            boolean r7 = r9.equals(r13)
            if (r7 != 0) goto L_0x00f3
            boolean r7 = r9.equals(r14)
            if (r7 == 0) goto L_0x0102
        L_0x00f3:
            if (r4 == 0) goto L_0x0102
            int r7 = r4.intValue()
            r8 = 1
            if (r7 != r8) goto L_0x00fd
            r10 = r15
        L_0x00fd:
            r5.put(r9, r10)
            goto L_0x0027
        L_0x0102:
            java.lang.String r7 = "Failed to get the default eu_consent_policy value."
            android.util.Log.w(r12, r7)
            goto L_0x0027
        L_0x0109:
            r5.put(r9, r15)
            goto L_0x0027
        L_0x010e:
            r5.put(r9, r10)
            goto L_0x0027
        L_0x0113:
            r2.zzc(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzl.zza(java.util.Map):void");
    }
}
