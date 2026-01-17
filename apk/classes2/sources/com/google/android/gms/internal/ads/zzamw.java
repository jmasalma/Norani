package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzamw implements zzaom {
    private final List zza;

    public zzamw() {
        this(0);
    }

    public zzamw(int i, List list) {
        this.zza = list;
    }

    private final zzaod zzc(zzaol zzaol) {
        return new zzaod(zze(zzaol), "video/mp2t");
    }

    private final zzaor zzd(zzaol zzaol) {
        return new zzaor(zze(zzaol), "video/mp2t");
    }

    private final List zze(zzaol zzaol) {
        String str;
        int i;
        List list;
        zzen zzen = new zzen(zzaol.zze);
        List list2 = this.zza;
        while (zzen.zza() > 0) {
            int zzm = zzen.zzm();
            int zzc = zzen.zzc() + zzen.zzm();
            if (zzm == 134) {
                list2 = new ArrayList();
                int zzm2 = zzen.zzm() & 31;
                for (int i2 = 0; i2 < zzm2; i2++) {
                    String zzB = zzen.zzB(3, StandardCharsets.UTF_8);
                    int zzm3 = zzen.zzm();
                    boolean z = (zzm3 & 128) != 0;
                    if (z) {
                        i = zzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzm4 = (byte) zzen.zzm();
                    zzen.zzM(1);
                    if (z) {
                        byte b = zzm4 & SignedBytes.MAX_POWER_OF_TWO;
                        int i3 = zzdk.zza;
                        list = Collections.singletonList(b != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzx zzx = new zzx();
                    zzx.zzah(str);
                    zzx.zzW(zzB);
                    zzx.zzB(i);
                    zzx.zzT(list);
                    list2.add(zzx.zzan());
                }
            }
            zzen.zzL(zzc);
        }
        return list2;
    }

    public final SparseArray zza() {
        return new SparseArray();
    }

    public zzamw(int i) {
        this.zza = zzfyq.zzn();
    }

    public final zzaoo zzb(int i, zzaol zzaol) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzant(new zzanl(zzaol.zzb, zzaol.zza(), "video/mp2t"));
            }
            if (i == 21) {
                return new zzant(new zzanj("video/mp2t"));
            }
            if (i == 27) {
                return new zzant(new zzang(zzc(zzaol), false, false, "video/mp2t"));
            }
            if (i == 36) {
                return new zzant(new zzani(zzc(zzaol), "video/mp2t"));
            }
            if (i == 45) {
                return new zzant(new zzanm("video/mp2t"));
            }
            if (i == 89) {
                return new zzant(new zzamy(zzaol.zzd, "video/mp2t"));
            }
            if (i == 172) {
                return new zzant(new zzamt(zzaol.zzb, zzaol.zza(), "video/mp2t"));
            }
            if (i == 257) {
                return new zzaob(new zzans("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzant(new zzamx(zzaol.zzb, zzaol.zza(), 5408, "video/mp2t"));
                        }
                        switch (i) {
                            case 15:
                                return new zzant(new zzamv(false, zzaol.zzb, zzaol.zza(), "video/mp2t"));
                            case 16:
                                return new zzant(new zzane(zzd(zzaol), "video/mp2t"));
                            case 17:
                                return new zzant(new zzank(zzaol.zzb, zzaol.zza(), "video/mp2t"));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzaob(new zzans("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzant(new zzamx(zzaol.zzb, zzaol.zza(), ConstantsKt.DEFAULT_BLOCK_SIZE, "video/mp2t"));
                }
                return new zzant(new zzamr(zzaol.zzb, zzaol.zza(), "video/mp2t"));
            }
        }
        return new zzant(new zzanb(zzd(zzaol), "video/mp2t"));
    }
}
