package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.UserMessagingPlatform;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class zzbo {
    private final zzdt zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    zzbo(zzdt zzdt, Executor executor) {
        this.zza = zzdt;
        this.zzb = executor;
    }

    public static /* synthetic */ void zza(zzbo zzbo, zzbc zzbc) {
        AtomicReference atomicReference = zzbo.zzd;
        Objects.requireNonNull(atomicReference);
        zzbc.zzf(new zzbf(atomicReference), new zzbg());
    }

    public final void zzb(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzcs.zza();
        zzbq zzbq = (zzbq) this.zzc.get();
        if (zzbq == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
        } else {
            ((zzaw) this.zza.zza()).zza(zzbq).zzb().zza().zzf(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
        }
    }

    public final void zzc() {
        zzbq zzbq = (zzbq) this.zzc.get();
        if (zzbq == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        zzbc zza2 = ((zzaw) this.zza.zza()).zza(zzbq).zzb().zza();
        zza2.zza = true;
        zzcs.zza.post(new zzbe(this, zza2));
    }

    public final void zzd(zzbq zzbq) {
        this.zzc.set(zzbq);
    }

    public final void zze(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzcs.zza();
        zzj zzb2 = zza.zza(activity).zzb();
        if (zzb2 == null) {
            zzcs.zza.post(new zzbh(onConsentFormDismissedListener));
        } else if (!zzb2.isConsentFormAvailable() && zzb2.getPrivacyOptionsRequirementStatus() != ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzcs.zza.post(new zzbi(onConsentFormDismissedListener));
            zzb2.zza(activity);
        } else if (zzb2.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            zzcs.zza.post(new zzbj(onConsentFormDismissedListener));
        } else {
            ConsentForm consentForm = (ConsentForm) this.zzd.get();
            if (consentForm == null) {
                zzcs.zza.post(new zzbk(onConsentFormDismissedListener));
                return;
            }
            consentForm.show(activity, onConsentFormDismissedListener);
            this.zzb.execute(new zzbl(this));
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
