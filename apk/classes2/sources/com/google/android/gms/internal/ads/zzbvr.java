package com.google.android.gms.internal.ads;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbvr implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r21) {
        /*
            r20 = this;
            r0 = r21
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r21)
            r2 = 0
            r3 = 0
            r15 = r2
            r16 = r15
            r19 = r16
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r17 = r14
            r18 = r17
        L_0x001b:
            int r2 = r21.dataPosition()
            if (r2 >= r1) goto L_0x008f
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r21)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 1: goto L_0x008a;
                case 2: goto L_0x0080;
                case 3: goto L_0x0076;
                case 4: goto L_0x0071;
                case 5: goto L_0x006c;
                case 6: goto L_0x0062;
                case 7: goto L_0x005d;
                case 8: goto L_0x002c;
                case 9: goto L_0x0058;
                case 10: goto L_0x004e;
                case 11: goto L_0x0049;
                case 12: goto L_0x0044;
                case 13: goto L_0x003f;
                case 14: goto L_0x003a;
                case 15: goto L_0x0035;
                case 16: goto L_0x0030;
                default: goto L_0x002c;
            }
        L_0x002c:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L_0x001b
        L_0x0030:
            int r19 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L_0x001b
        L_0x0035:
            android.os.Bundle r18 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x001b
        L_0x003a:
            android.os.Bundle r17 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x001b
        L_0x003f:
            boolean r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x001b
        L_0x0044:
            boolean r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L_0x001b
        L_0x0049:
            java.lang.String r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x001b
        L_0x004e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzfeq> r3 = com.google.android.gms.internal.ads.zzfeq.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r13 = r2
            com.google.android.gms.internal.ads.zzfeq r13 = (com.google.android.gms.internal.ads.zzfeq) r13
            goto L_0x001b
        L_0x0058:
            java.lang.String r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x001b
        L_0x005d:
            java.lang.String r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x001b
        L_0x0062:
            android.os.Parcelable$Creator r3 = android.content.pm.PackageInfo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r10 = r2
            android.content.pm.PackageInfo r10 = (android.content.pm.PackageInfo) r10
            goto L_0x001b
        L_0x006c:
            java.util.ArrayList r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringList(r0, r2)
            goto L_0x001b
        L_0x0071:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L_0x001b
        L_0x0076:
            android.os.Parcelable$Creator r3 = android.content.pm.ApplicationInfo.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r7 = r2
            android.content.pm.ApplicationInfo r7 = (android.content.pm.ApplicationInfo) r7
            goto L_0x001b
        L_0x0080:
            android.os.Parcelable$Creator r3 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r6 = r2
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6 = (com.google.android.gms.ads.internal.util.client.VersionInfoParcel) r6
            goto L_0x001b
        L_0x008a:
            android.os.Bundle r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r0, r2)
            goto L_0x001b
        L_0x008f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.internal.ads.zzbvq r0 = new com.google.android.gms.internal.ads.zzbvq
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvr.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbvq[i];
    }
}
