package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbyb implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final zzg zzc;
    private String zzd = "-1";
    private int zze = -1;

    zzbyb(Context context, zzg zzg) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzg;
        this.zza = context;
    }

    private final void zzb() {
        this.zzc.zzD(true);
        zzad.zzc(this.zza);
    }

    private final void zzc(String str, int i) {
        Context context;
        boolean z = false;
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzaN)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        this.zzc.zzD(z);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgv)).booleanValue() && z && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1 A[Catch:{ all -> 0x00b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzaP     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00b5 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x00b5 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00b5 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "-1"
            r3 = -1
            java.lang.String r4 = "gad_has_consent_for_cookies"
            if (r1 == 0) goto L_0x0051
            boolean r0 = java.util.Objects.equals(r10, r4)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0032
            int r9 = r9.getInt(r4, r3)     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch:{ all -> 0x00b5 }
            int r0 = r10.zzb()     // Catch:{ all -> 0x00b5 }
            if (r9 == r0) goto L_0x002e
            r8.zzb()     // Catch:{ all -> 0x00b5 }
        L_0x002e:
            r10.zzA(r9)     // Catch:{ all -> 0x00b5 }
            return
        L_0x0032:
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = java.util.Objects.equals(r10, r0)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r9 = r9.getString(r10, r2)     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.ads.internal.util.zzg r10 = r8.zzc     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = r10.zzm()     // Catch:{ all -> 0x00b5 }
            boolean r0 = java.util.Objects.equals(r9, r0)     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x004d
            r8.zzb()     // Catch:{ all -> 0x00b5 }
        L_0x004d:
            r10.zzJ(r9)     // Catch:{ all -> 0x00b5 }
            return
        L_0x0051:
            java.lang.String r1 = r9.getString(r0, r2)     // Catch:{ all -> 0x00b5 }
            int r9 = r9.getInt(r4, r3)     // Catch:{ all -> 0x00b5 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x00b5 }
            int r5 = r10.hashCode()     // Catch:{ all -> 0x00b5 }
            r6 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r7 = 1
            if (r5 == r6) goto L_0x0075
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r5 == r0) goto L_0x006d
            goto L_0x007d
        L_0x006d:
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x007d
            r10 = r7
            goto L_0x007e
        L_0x0075:
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x007d
            r10 = 0
            goto L_0x007e
        L_0x007d:
            r10 = r3
        L_0x007e:
            if (r10 == 0) goto L_0x00a1
            if (r10 == r7) goto L_0x0083
            goto L_0x00b4
        L_0x0083:
            com.google.android.gms.internal.ads.zzbcv r10 = com.google.android.gms.internal.ads.zzbde.zzaN     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00b5 }
            java.lang.Object r10 = r0.zzb(r10)     // Catch:{ all -> 0x00b5 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00b5 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00b5 }
            if (r10 == 0) goto L_0x00b4
            if (r9 == r3) goto L_0x00b4
            int r10 = r8.zze     // Catch:{ all -> 0x00b5 }
            if (r10 == r9) goto L_0x00b4
            r8.zze = r9     // Catch:{ all -> 0x00b5 }
            r8.zzc(r1, r9)     // Catch:{ all -> 0x00b5 }
            return
        L_0x00a1:
            boolean r10 = r1.equals(r2)     // Catch:{ all -> 0x00b5 }
            if (r10 != 0) goto L_0x00b4
            java.lang.String r10 = r8.zzd     // Catch:{ all -> 0x00b5 }
            boolean r10 = r10.equals(r1)     // Catch:{ all -> 0x00b5 }
            if (r10 != 0) goto L_0x00b4
            r8.zzd = r1     // Catch:{ all -> 0x00b5 }
            r8.zzc(r1, r9)     // Catch:{ all -> 0x00b5 }
        L_0x00b4:
            return
        L_0x00b5:
            r9 = move-exception
            java.lang.String r10 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            com.google.android.gms.internal.ads.zzbzs r0 = com.google.android.gms.ads.internal.zzv.zzp()
            r0.zzw(r9, r10)
            java.lang.String r10 = "onSharedPreferenceChanged, errorMessage = "
            com.google.android.gms.ads.internal.util.zze.zzb(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyb.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        SharedPreferences sharedPreferences = this.zzb;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzaP)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }
}
