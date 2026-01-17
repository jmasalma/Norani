package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeqz implements zzeuc {
    private final Context zza;
    private final zzgdy zzb;

    zzeqz(Context context, zzgdy zzgdy) {
        this.zza = context;
        this.zzb = zzgdy;
    }

    public static /* synthetic */ zzeqx zzc(zzeqz zzeqz) {
        String str;
        Bundle bundle;
        zzv.zzr();
        String str2 = "";
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzgo)).booleanValue()) {
            str = str2;
        } else {
            str = zzeqz.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str2);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgq)).booleanValue()) {
            str2 = zzeqz.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str2);
        }
        zzv.zzr();
        Context context = zzeqz.zza;
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzgp)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (defaultSharedPreferences.contains(str3)) {
                    bundle.putString(str3, defaultSharedPreferences.getString(str3, (String) null));
                }
            }
        }
        return new zzeqx(str, str2, bundle, (zzeqy) null);
    }

    public final int zza() {
        return 18;
    }

    public final ListenableFuture zzb() {
        return this.zzb.zzb(new zzeqw(this));
    }
}
