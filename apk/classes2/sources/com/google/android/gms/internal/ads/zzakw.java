package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzakw implements zzafb {
    private final zzafb zza;
    private final zzakr zzb;
    private final zzen zzc = new zzen();
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzex.zzb;
    private zzakt zzg;
    private zzz zzh;
    private boolean zzi;

    public zzakw(zzafb zzafb, zzakr zzakr) {
        this.zza = zzafb;
        this.zzb = zzakr;
    }

    public static /* synthetic */ void zza(zzakw zzakw, long j, int i, zzakl zzakl) {
        zzdd.zzb(zzakw.zzh);
        zzfyq<zzcu> zzfyq = zzakl.zza;
        long j2 = zzakl.zzc;
        ArrayList arrayList = new ArrayList(zzfyq.size());
        for (zzcu zza2 : zzfyq) {
            Bundle zza3 = zza2.zza();
            Bundle bundle = zza3;
            arrayList.add(zza3);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("c", arrayList);
        bundle2.putLong("d", j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle2);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzen zzen = zzakw.zzc;
        int length = marshall.length;
        zzen.zzJ(marshall, length);
        zzafb zzafb = zzakw.zza;
        zzafb.zzr(zzen, length);
        long j3 = zzakl.zzb;
        if (j3 == -9223372036854775807L) {
            zzdd.zzf(zzakw.zzh.zzt == LongCompanionObject.MAX_VALUE);
        } else {
            long j4 = zzakw.zzh.zzt;
            j = j4 == LongCompanionObject.MAX_VALUE ? j + j3 : j3 + j4;
        }
        zzafb.zzt(j, i | 1, length, 0, (zzafa) null);
    }

    private final void zzc(int i) {
        byte[] bArr;
        int length = this.zzf.length;
        int i2 = this.zze;
        if (length - i2 < i) {
            int i3 = i2 - this.zzd;
            int max = Math.max(i3 + i3, i + i3);
            byte[] bArr2 = this.zzf;
            if (max <= bArr2.length) {
                bArr = bArr2;
            } else {
                bArr = new byte[max];
            }
            System.arraycopy(bArr2, this.zzd, bArr, 0, i3);
            this.zzd = 0;
            this.zze = i3;
            this.zzf = bArr;
        }
    }

    public final void zzb(boolean z) {
        this.zzi = true;
    }

    public final /* synthetic */ int zzf(zzl zzl, int i, boolean z) {
        return zzaez.zza(this, zzl, i, z);
    }

    public final int zzg(zzl zzl, int i, boolean z, int i2) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzg(zzl, i, z, 0);
        }
        zzc(i);
        int zza2 = zzl.zza(this.zzf, this.zze, i);
        if (zza2 != -1) {
            this.zze += zza2;
            return zza2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final /* synthetic */ void zzl(long j) {
    }

    public final void zzm(zzz zzz) {
        String str = zzz.zzo;
        str.getClass();
        zzdd.zzd(zzay.zzb(str) == 3);
        if (!zzz.equals(this.zzh)) {
            this.zzh = zzz;
            zzakr zzakr = this.zzb;
            this.zzg = zzakr.zzc(zzz) ? zzakr.zzb(zzz) : null;
        }
        if (this.zzg == null) {
            this.zza.zzm(zzz);
            return;
        }
        zzafb zzafb = this.zza;
        zzx zzb2 = zzz.zzb();
        zzb2.zzah("application/x-media3-cues");
        zzb2.zzE(str);
        zzb2.zzal(LongCompanionObject.MAX_VALUE);
        zzb2.zzI(this.zzb.zza(zzz));
        zzafb.zzm(zzb2.zzan());
    }

    public final /* synthetic */ void zzr(zzen zzen, int i) {
        zzaez.zzb(this, zzen, i);
    }

    public final void zzs(zzen zzen, int i, int i2) {
        if (this.zzg == null) {
            this.zza.zzs(zzen, i, i2);
            return;
        }
        zzc(i);
        zzen.zzH(this.zzf, this.zze, i);
        this.zze += i;
    }

    public final void zzt(long j, int i, int i2, int i3, zzafa zzafa) {
        if (this.zzg == null) {
            this.zza.zzt(j, i, i2, i3, zzafa);
            return;
        }
        zzdd.zze(zzafa == null, "DRM on subtitles is not supported");
        int i4 = (this.zze - i3) - i2;
        try {
            this.zzg.zza(this.zzf, i4, i2, zzaks.zza(), new zzakv(this, j, i));
        } catch (RuntimeException e) {
            if (this.zzi) {
                zzea.zzg("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
            } else {
                throw e;
            }
        }
        int i5 = i4 + i2;
        this.zzd = i5;
        if (i5 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
