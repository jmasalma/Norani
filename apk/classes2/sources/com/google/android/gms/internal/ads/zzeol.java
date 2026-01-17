package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeol implements zzeuc {
    private final zzgdy zza;
    private final Context zzb;

    zzeol(zzgdy zzgdy, Context context) {
        this.zza = zzgdy;
        this.zzb = context;
    }

    public static /* synthetic */ zzeom zzc(zzeol zzeol) {
        boolean z;
        double d = -1.0d;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzmv)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) zzeol.zzb.getSystemService("batterymanager");
            if (batteryManager != null) {
                d = ((double) batteryManager.getIntProperty(4)) / 100.0d;
            }
            if (batteryManager != null) {
                z = batteryManager.isCharging();
            } else {
                z = zze(zzeol.zzd());
            }
        } else {
            Intent zzd = zzeol.zzd();
            boolean zze = zze(zzd);
            if (zzd != null) {
                d = ((double) zzd.getIntExtra("level", -1)) / ((double) zzd.getIntExtra("scale", -1));
            }
            z = zze;
        }
        return new zzeom(d, z);
    }

    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzlv)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            return this.zzb.registerReceiver((BroadcastReceiver) null, intentFilter);
        }
        return this.zzb.registerReceiver((BroadcastReceiver) null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public final int zza() {
        return 14;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeok(this));
    }
}
