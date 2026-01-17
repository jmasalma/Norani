package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzbfn;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
abstract class zzba {
    private static final zzcr zza;

    static {
        zzcr zzcr = null;
        try {
            Object newInstance = zzaz.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzo.zzj("ClientApi class is not an instance of IBinder.");
            } else {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzcr = queryLocalInterface instanceof zzcr ? (zzcr) queryLocalInterface : new zzcp(iBinder);
                }
            }
        } catch (Exception unused) {
            zzo.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzcr;
    }

    zzba() {
    }

    private final Object zze() {
        zzcr zzcr = zza;
        if (zzcr != null) {
            try {
                return zzb(zzcr);
            } catch (RemoteException e) {
                zzo.zzk("Cannot invoke local loader using ClientApi class.", e);
                return null;
            }
        } else {
            zzo.zzj("ClientApi class cannot be loaded.");
            return null;
        }
    }

    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e) {
            zzo.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object zza();

    /* access modifiers changed from: protected */
    public abstract Object zzb(zzcr zzcr) throws RemoteException;

    /* access modifiers changed from: protected */
    public abstract Object zzc() throws RemoteException;

    public final Object zzd(Context context, boolean z) {
        boolean z2;
        Object obj;
        if (!z) {
            zzbb.zzb();
            if (!zzf.zzx(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzo.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
        zzbde.zza(context);
        if (((Boolean) zzbez.zza.zze()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) zzbez.zzb.zze()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        if (z3) {
            obj = zze();
            if (obj == null && !z2) {
                obj = zzf();
            }
        } else {
            Object zzf = zzf();
            if (zzf == null) {
                if (zzbb.zze().nextInt(((Long) zzbfn.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzbb.zzb().zzs(context, zzbb.zzc().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            obj = zzf == null ? zze() : zzf;
        }
        return obj == null ? zza() : obj;
    }
}
