package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    private final String zza;
    @Nullable
    private final zzj zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzs(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        byte[] bArr;
        this.zza = str;
        zzk zzk = null;
        if (iBinder != null) {
            try {
                IObjectWrapper zzd2 = zzz.zzg(iBinder).zzd();
                if (zzd2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) ObjectWrapper.unwrap(zzd2);
                }
                if (bArr != null) {
                    zzk = new zzk(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.zzb = zzk;
        this.zzc = z;
        this.zzd = z2;
    }

    zzs(String str, @Nullable zzj zzj, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzj;
        this.zzc = z;
        this.zzd = z2;
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            com.google.android.gms.common.zzj r5 = r3.zzb
            if (r5 != 0) goto L_0x0017
            java.lang.String r5 = "GoogleCertificatesQuery"
            java.lang.String r1 = "certificate binder is null"
            android.util.Log.w(r5, r1)
            r5 = 0
        L_0x0017:
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r4, r1, r5, r2)
            r5 = 3
            boolean r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            r5 = 4
            boolean r1 = r3.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzs.writeToParcel(android.os.Parcel, int):void");
    }
}
