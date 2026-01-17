package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzags {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzags() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(ConstantsKt.MINIMUM_BLOCK_SIZE);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzagr zzagr) {
        ByteArrayOutputStream byteArrayOutputStream = this.zza;
        byteArrayOutputStream.reset();
        try {
            DataOutputStream dataOutputStream = this.zzb;
            zzb(dataOutputStream, zzagr.zza);
            zzb(dataOutputStream, zzagr.zzb);
            dataOutputStream.writeLong(zzagr.zzc);
            dataOutputStream.writeLong(zzagr.zzd);
            dataOutputStream.write(zzagr.zze);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
