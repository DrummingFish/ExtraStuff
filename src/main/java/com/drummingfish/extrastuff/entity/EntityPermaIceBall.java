package com.drummingfish.extrastuff.entity;

import cpw.mods.fml.common.registry.IThrowableEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityPermaIceBall extends EntityThrowable implements IThrowableEntity {

    public EntityPermaIceBall(World world, EntityLivingBase base) {
        super(world, base);
    }

    public EntityPermaIceBall(World world) {
        super(world);
    }

    public EntityPermaIceBall(World world, double p_i1775_2_, double p_i1775_4_, double p_i1775_6_) {
        super(world, p_i1775_2_, p_i1775_4_, p_i1775_6_);
    }

    @Override
    protected void onImpact(MovingObjectPosition pos) {
        if (pos.entityHit != null) {
            byte b0 = 2;

            if (pos.entityHit instanceof EntityBlaze) {
                b0 = 5;
            }

            pos.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
        }

        for (int i = 0; i < 8; ++i) {
            this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote) {
            this.setDead();
        }
    }

    @Override
    public void setThrower(Entity entity) {
    }
}
