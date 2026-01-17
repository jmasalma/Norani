package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfxg extends zzfxe implements ListIterator {
    final /* synthetic */ zzfxh zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfxg(zzfxh zzfxh) {
        super(zzfxh);
        Objects.requireNonNull(zzfxh);
        this.zzd = zzfxh;
    }

    public final void add(Object obj) {
        zzfxh zzfxh = this.zzd;
        boolean isEmpty = zzfxh.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfxi zzfxi = zzfxh.zzf;
        zzfxi.zzb = zzfxi.zzb + 1;
        if (isEmpty) {
            zzfxh.zza();
        }
    }

    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfxg(zzfxh zzfxh, int i) {
        super(zzfxh, ((List) zzfxh.zzb).listIterator(i));
        Objects.requireNonNull(zzfxh);
        this.zzd = zzfxh;
    }
}
