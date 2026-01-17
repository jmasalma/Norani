package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhhi extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzhhi(zzbef zzbef) {
        this.zza = new WeakReference(zzbef);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbef zzbef = (zzbef) this.zza.get();
        if (zzbef != null) {
            zzbef.zzc(customTabsClient);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbef zzbef = (zzbef) this.zza.get();
        if (zzbef != null) {
            zzbef.zzd();
        }
    }
}
