package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfqr extends zzfqy {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzfqr(String str, boolean z, int i, zzfqn zzfqn, zzfqo zzfqo, int i2, zzfqq zzfqq) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqy) {
            zzfqy zzfqy = (zzfqy) obj;
            if (this.zzb.equals(zzfqy.zzc())) {
                zzfqy.zzd();
                int i = this.zzc;
                int zze = zzfqy.zze();
                if (i == 0) {
                    throw null;
                } else if (i == zze) {
                    zzfqy.zza();
                    zzfqy.zzb();
                    int i2 = this.zzd;
                    int zzf = zzfqy.zzf();
                    if (i2 == 0) {
                        throw null;
                    } else if (zzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        int i = this.zzc;
        if (i != 0) {
            int i2 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i;
            if (this.zzd != 0) {
                return (i2 * 583896283) ^ 1;
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        int i = this.zzc;
        String str = "null";
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? str : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.zzd == 1) {
            str = "READ_AND_WRITE";
        }
        String str3 = this.zzb;
        return "FileComplianceOptions{fileOwner=" + str3 + ", hasDifferentDmaOwner=false, fileChecks=" + str2 + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str + "}";
    }

    public final zzfqn zza() {
        return null;
    }

    public final zzfqo zzb() {
        return null;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return false;
    }

    public final int zze() {
        return this.zzc;
    }

    public final int zzf() {
        return this.zzd;
    }
}
