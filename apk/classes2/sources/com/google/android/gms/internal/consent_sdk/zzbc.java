package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.core.view.WindowCompat;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class zzbc implements ConsentForm {
    boolean zza = false;
    /* access modifiers changed from: private */
    public final Application zzb;
    /* access modifiers changed from: private */
    public final zzbx zzc;
    private final zzaq zzd;
    private final zzbq zze;
    private final zzdt zzf;
    /* access modifiers changed from: private */
    public Dialog zzg;
    private zzbv zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    /* access modifiers changed from: private */
    public final AtomicReference zzl = new AtomicReference();

    public zzbc(Application application, zzad zzad, zzbx zzbx, zzaq zzaq, zzbq zzbq, zzdt zzdt) {
        this.zzb = application;
        this.zzc = zzbx;
        this.zzd = zzaq;
        this.zze = zzbq;
        this.zzf = zzdt;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza((Activity) null);
        zzaz zzaz = (zzaz) this.zzl.getAndSet((Object) null);
        if (zzaz != null) {
            zzaz.zzb();
        }
    }

    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        String str;
        zzcs.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            if (true != this.zza) {
                str = "ConsentForm#show can only be invoked once.";
            } else {
                str = "Privacy options form is being loading. Please try again later.";
            }
            onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, str).zza());
            return;
        }
        this.zzh.zzc();
        zzaz zzaz = new zzaz(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzaz);
        this.zzl.set(zzaz);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        this.zzk.set(onConsentFormDismissedListener);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    /* access modifiers changed from: package-private */
    public final zzbv zzc() {
        return this.zzh;
    }

    /* access modifiers changed from: package-private */
    public final void zzf(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzbv zzb2 = ((zzbw) this.zzf).zza();
        zzbv zzbv = zzb2;
        this.zzh = zzb2;
        zzb2.setBackgroundColor(0);
        zzb2.getSettings().setJavaScriptEnabled(true);
        zzb2.getSettings().setAllowFileAccess(false);
        zzb2.getSettings().setAllowContentAccess(false);
        zzb2.setWebViewClient(new zzbt(zzb2, (zzbu) null));
        this.zzj.set(new zzba(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, (zzbb) null));
        zzbv zzbv2 = this.zzh;
        zzbq zzbq = this.zze;
        zzbv2.loadDataWithBaseURL(zzbq.zza(), zzbq.zzb(), "text/html", "UTF-8", (String) null);
        zzcs.zza.postDelayed(new zzay(this), 10000);
    }

    /* access modifiers changed from: package-private */
    public final void zzg(int i) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet((Object) null);
        if (onConsentFormDismissedListener != null) {
            this.zzd.zzg(i);
            onConsentFormDismissedListener.onConsentFormDismissed((FormError) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zzg zzg2) {
        zzk();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzk.getAndSet((Object) null);
        if (onConsentFormDismissedListener != null) {
            onConsentFormDismissedListener.onConsentFormDismissed(zzg2.zza());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzi() {
        zzba zzba = (zzba) this.zzj.getAndSet((Object) null);
        if (zzba != null) {
            zzba.onConsentFormLoadSuccess(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzj(zzg zzg2) {
        zzba zzba = (zzba) this.zzj.getAndSet((Object) null);
        if (zzba != null) {
            zzba.onConsentFormLoadFailure(zzg2.zza());
        }
    }
}
