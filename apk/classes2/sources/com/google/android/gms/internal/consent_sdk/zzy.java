package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
final class zzy {
    private final zzz zza;
    private final zzcl zzb;
    private int zzc = 0;
    private ConsentInformation.PrivacyOptionsRequirementStatus zzd = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    zzy(zzz zzz, zzcl zzcl) {
        this.zza = zzz;
        this.zzb = zzcl;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.consent_sdk.zzab zza() throws com.google.android.gms.internal.consent_sdk.zzg {
        /*
            r12 = this;
            com.google.android.gms.internal.consent_sdk.zzcl r0 = r12.zzb
            int r1 = r0.zzf
            r2 = 8
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x000c
            r2 = r4
            goto L_0x000d
        L_0x000c:
            r2 = r3
        L_0x000d:
            com.google.android.gms.internal.consent_sdk.zzz r5 = r12.zza
            com.google.android.gms.internal.consent_sdk.zzaq r6 = r5.zzc
            r6.zzh(r2)
            int r2 = r1 + -1
            r6 = 0
            if (r1 == 0) goto L_0x00ce
            java.lang.String r1 = "Invalid response from server."
            r7 = 3
            r8 = 2
            switch(r2) {
                case 1: goto L_0x0052;
                case 2: goto L_0x0052;
                case 3: goto L_0x0052;
                case 4: goto L_0x004f;
                case 5: goto L_0x004c;
                case 6: goto L_0x003a;
                case 7: goto L_0x0028;
                default: goto L_0x0022;
            }
        L_0x0022:
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            r0.<init>(r4, r1)
            throw r0
        L_0x0028:
            com.google.android.gms.internal.consent_sdk.zzg r1 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = r0.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Publisher misconfiguration: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r7, r0)
            throw r1
        L_0x003a:
            com.google.android.gms.internal.consent_sdk.zzg r1 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = r0.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Invalid response from server: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r4, r0)
            throw r1
        L_0x004c:
            r12.zzc = r4
            goto L_0x0054
        L_0x004f:
            r12.zzc = r8
            goto L_0x0054
        L_0x0052:
            r12.zzc = r7
        L_0x0054:
            int r2 = r0.zzg
            int r7 = r2 + -1
            if (r2 == 0) goto L_0x00cd
            if (r7 == r4) goto L_0x0069
            if (r7 != r8) goto L_0x0063
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED
            r12.zzd = r1
            goto L_0x006d
        L_0x0063:
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            r0.<init>(r4, r1)
            throw r0
        L_0x0069:
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED
            r12.zzd = r1
        L_0x006d:
            java.lang.String r1 = r0.zza
            if (r1 != 0) goto L_0x0073
            r2 = r6
            goto L_0x007a
        L_0x0073:
            com.google.android.gms.internal.consent_sdk.zzbq r2 = new com.google.android.gms.internal.consent_sdk.zzbq
            java.lang.String r7 = r0.zzb
            r2.<init>(r7, r1)
        L_0x007a:
            com.google.android.gms.internal.consent_sdk.zzaq r1 = r5.zzc
            java.util.HashSet r7 = new java.util.HashSet
            java.util.List r9 = r0.zzd
            r7.<init>(r9)
            r1.zzj(r7)
            java.util.List r0 = r0.zze
            java.util.Iterator r0 = r0.iterator()
        L_0x008e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c3
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.consent_sdk.zzck r1 = (com.google.android.gms.internal.consent_sdk.zzck) r1
            int r7 = r1.zzb
            int r9 = r7 + -1
            if (r7 == 0) goto L_0x00c2
            if (r9 == 0) goto L_0x00ad
            if (r9 == r4) goto L_0x00aa
            if (r9 == r8) goto L_0x00a7
            goto L_0x00ad
        L_0x00a7:
            java.lang.String r7 = "clear"
            goto L_0x00ae
        L_0x00aa:
            java.lang.String r7 = "write"
            goto L_0x00ae
        L_0x00ad:
            r7 = r6
        L_0x00ae:
            if (r7 == 0) goto L_0x008e
            com.google.android.gms.internal.consent_sdk.zze r9 = r5.zza
            java.lang.String r1 = r1.zza
            com.google.android.gms.internal.consent_sdk.zzd[] r10 = new com.google.android.gms.internal.consent_sdk.zzd[r4]
            com.google.android.gms.internal.consent_sdk.zzao r11 = r5.zzb
            r10[r3] = r11
            r9.zzb(r7, r1, r10)
            goto L_0x008e
        L_0x00c2:
            throw r6
        L_0x00c3:
            com.google.android.gms.internal.consent_sdk.zzab r0 = new com.google.android.gms.internal.consent_sdk.zzab
            int r1 = r12.zzc
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r3 = r12.zzd
            r0.<init>(r1, r3, r2, r6)
            return r0
        L_0x00cd:
            throw r6
        L_0x00ce:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzy.zza():com.google.android.gms.internal.consent_sdk.zzab");
    }
}
