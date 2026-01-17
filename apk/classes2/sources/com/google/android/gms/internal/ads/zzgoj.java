package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgoj {
    private final Map zza = new HashMap();

    public final zzgoj zza(zzgxe zzgxe, Object obj) throws GeneralSecurityException {
        List list;
        if (zzgxe.zza() == 0 || zzgxe.zza() == 5) {
            Map map = this.zza;
            if (map.containsKey(zzgxe)) {
                list = (List) map.get(zzgxe);
            } else {
                ArrayList arrayList = new ArrayList();
                map.put(zzgxe, arrayList);
                list = arrayList;
            }
            list.add(obj);
            return this;
        }
        throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
    }

    public final zzgom zzb() {
        return new zzgom(this.zza, (zzgol) null);
    }
}
