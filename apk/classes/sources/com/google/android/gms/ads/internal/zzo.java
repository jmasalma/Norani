package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzfdx;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzo extends WebViewClient {
    final /* synthetic */ zzu zza;

    zzo(zzu zzu) {
        Objects.requireNonNull(zzu);
        this.zza = zzu;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzu zzu = this.zza;
        if (zzu.zzg != null) {
            try {
                zzu.zzg.zzf(zzfdx.zzd(1, (String) null, (zze) null));
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        zzu zzu2 = this.zza;
        if (zzu2.zzg != null) {
            try {
                zzu2.zzg.zze(0);
            } catch (RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzu zzu = this.zza;
        if (str.startsWith(zzu.zzr())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (zzu.zzg != null) {
                try {
                    zzu.zzg.zzf(zzfdx.zzd(3, (String) null, (zze) null));
                } catch (RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
            zzu zzu2 = this.zza;
            if (zzu2.zzg != null) {
                try {
                    zzu2.zzg.zze(3);
                } catch (RemoteException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.zza.zzX(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzu zzu3 = this.zza;
            if (zzu3.zzg != null) {
                try {
                    zzu3.zzg.zzf(zzfdx.zzd(1, (String) null, (zze) null));
                } catch (RemoteException e3) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzu zzu4 = this.zza;
            if (zzu4.zzg != null) {
                try {
                    zzu4.zzg.zze(0);
                } catch (RemoteException e4) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.zza.zzX(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            zzu zzu5 = this.zza;
            if (zzu5.zzg != null) {
                try {
                    zzu5.zzg.zzi();
                } catch (RemoteException e5) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e5);
                }
            }
            zzu zzu6 = this.zza;
            zzu6.zzX(zzu6.zzb(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            zzu zzu7 = this.zza;
            if (zzu7.zzg != null) {
                try {
                    zzu7.zzg.zzc();
                    zzu7.zzg.zzh();
                } catch (RemoteException e6) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
                }
            }
            zzu zzu8 = this.zza;
            zzu.zzx(zzu8, zzu.zzp(zzu8, str));
            return true;
        }
    }
}
