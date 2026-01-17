package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfqi {
    final zzfql zza;
    final boolean zzb;

    private zzfqi(zzfql zzfql) {
        this.zza = zzfql;
        this.zzb = zzfql != null;
    }

    public static zzfqi zzb(Context context, String str, String str2) {
        zzfql zzfql;
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite").instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            IBinder iBinder = instantiate;
            if (instantiate == null) {
                zzfql = null;
            } else {
                IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                zzfql = queryLocalInterface instanceof zzfql ? (zzfql) queryLocalInterface : new zzfqj(instantiate);
            }
            try {
                zzfql zzfql2 = zzfql;
                zzfql.zze(ObjectWrapper.wrap(context), str, (String) null);
                Log.i("GASS", "GassClearcutLogger Initialized.");
                return new zzfqi(zzfql);
            } catch (RemoteException | zzfpk | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfqi(new zzfqm());
            }
        } catch (Exception e) {
            throw new zzfpk(e);
        } catch (Exception e2) {
            throw new zzfpk(e2);
        }
    }

    public static zzfqi zzc() {
        zzfqm zzfqm = new zzfqm();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfqi(zzfqm);
    }

    public final zzfqg zza(byte[] bArr) {
        return new zzfqg(this, bArr, (zzfqh) null);
    }
}
