package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbgf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        zzgc zzgc = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 2:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 3:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 4:
                    z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 5:
                    i3 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 6:
                    zzgc = SafeParcelReader.createParcelable(parcel2, readHeader, zzgc.CREATOR);
                    break;
                case 7:
                    z3 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 8:
                    i4 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 9:
                    i5 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 10:
                    z4 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 11:
                    i6 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzbge(i, z, i2, z2, i3, zzgc, z3, i4, i5, z4, i6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbge[i];
    }
}
