package com.teamacronymcoders.contenttweaker.api.ctobjects.mutableitemstack;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.IEntityLivingBase;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenClass("mods.contenttweaker.MutableItemStack")
public interface IMutableItemStack extends IItemStack {
    @ZenMethod
    void setCount(int count);

    @ZenMethod
    void shrink(int count);

    @ZenMethod
    void grow(int count);

    @ZenMethod
    void damage(int amount, IEntityLivingBase player);
}
