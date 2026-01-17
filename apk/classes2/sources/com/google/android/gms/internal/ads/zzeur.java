package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeur implements zzeuc {
    private final zzgdy zza;
    private final Context zzb;

    public zzeur(zzgdy zzgdy, Context context) {
        this.zza = zzgdy;
        this.zzb = context;
    }

    public static /* synthetic */ zzeup zzc(zzeur zzeur) {
        int i;
        boolean z;
        Context context = zzeur.zzb;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        zzv.zzr();
        int i2 = -1;
        if (zzs.zzB(context, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i2 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
        } else {
            z = false;
            i = -2;
        }
        return new zzeup(networkOperator, i, zzv.zzs().zzm(context), phoneType, z, i2);
    }

    public final int zza() {
        return 39;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeuq(this));
    }
}
