package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzavk implements zzfqb {
    final /* synthetic */ zzfod zza;

    zzavk(zzavm zzavm, zzfod zzfod) {
        this.zza = zzfod;
    }

    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
