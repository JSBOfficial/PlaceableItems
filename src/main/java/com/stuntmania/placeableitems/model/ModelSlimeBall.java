package com.stuntmania.placeableitems.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelSlimeBall extends ModelBase {
	// fields
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape1;
	ModelRenderer Shape17;
	ModelRenderer Shape18;
	ModelRenderer Shape19;
	ModelRenderer Shape20;
	ModelRenderer Shape21;
	ModelRenderer Shape22;
	
	public ModelSlimeBall() {
		textureWidth = 114;
		textureHeight = 109;
		
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 5, 4, 5);
		Shape2.setRotationPoint(-2.5F, 20F, -2.5F);
		Shape2.setTextureSize(114, 109);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 25, 11);
		Shape3.addBox(0F, 0F, 0F, 4, 1, 4);
		Shape3.setRotationPoint(-2F, 19.5F, -2F);
		Shape3.setTextureSize(114, 109);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 30, 0);
		Shape4.addBox(0F, 0F, 0F, 4, 3, 1);
		Shape4.setRotationPoint(-2F, 21F, -3F);
		Shape4.setTextureSize(114, 109);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 53, 0);
		Shape5.addBox(0F, 0F, 0F, 4, 3, 1);
		Shape5.setRotationPoint(-2F, 21F, 2F);
		Shape5.setTextureSize(114, 109);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 42, 0);
		Shape6.addBox(0F, 0F, 0F, 1, 3, 4);
		Shape6.setRotationPoint(2F, 21F, -2F);
		Shape6.setTextureSize(114, 109);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 42, 0);
		Shape7.addBox(0F, 0F, 0F, 1, 3, 4);
		Shape7.setRotationPoint(-3F, 21F, -2F);
		Shape7.setTextureSize(114, 109);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 25, 0);
		Shape8.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape8.setRotationPoint(4F, 23F, 0F);
		Shape8.setTextureSize(114, 109);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 0, 28);
		Shape9.addBox(0F, 0F, 0F, 4, 1, 2);
		Shape9.setRotationPoint(-6F, 23F, -4F);
		Shape9.setTextureSize(114, 109);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 15, 28);
		Shape10.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape10.setRotationPoint(-3F, 23F, -6F);
		Shape10.setTextureSize(114, 109);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 25, 0);
		Shape11.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape11.setRotationPoint(-5F, 23F, -2F);
		Shape11.setTextureSize(114, 109);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 25, 0);
		Shape12.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape12.setRotationPoint(-6.5F, 23F, -4.5F);
		Shape12.setTextureSize(114, 109);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 25, 27);
		Shape13.addBox(0F, 0F, 0F, 3, 1, 3);
		Shape13.setRotationPoint(1F, 23F, 1F);
		Shape13.setTextureSize(114, 109);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 25, 0);
		Shape14.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape14.setRotationPoint(3F, 23F, 4F);
		Shape14.setTextureSize(114, 109);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 25, 0);
		Shape15.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape15.setRotationPoint(4F, 23F, 3F);
		Shape15.setTextureSize(114, 109);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 25, 0);
		Shape16.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape16.setRotationPoint(2F, 22F, 2F);
		Shape16.setTextureSize(114, 109);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 0, 20);
		Shape1.addBox(0F, 0F, 0F, 3, 1, 1);
		Shape1.setRotationPoint(2F, 23F, -3F);
		Shape1.setTextureSize(114, 109);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 0, 24);
		Shape17.addBox(0F, 0F, 0F, 2, 1, 2);
		Shape17.setRotationPoint(1F, 23F, -5F);
		Shape17.setTextureSize(114, 109);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelRenderer(this, 25, 0);
		Shape18.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape18.setRotationPoint(0F, 23F, -6F);
		Shape18.setTextureSize(114, 109);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);
		Shape19 = new ModelRenderer(this, 25, 0);
		Shape19.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape19.setRotationPoint(2.5F, 23F, -5.5F);
		Shape19.setTextureSize(114, 109);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, 0F);
		Shape20 = new ModelRenderer(this, 40, 27);
		Shape20.addBox(0F, 0F, 0F, 4, 1, 3);
		Shape20.setRotationPoint(-5F, 23F, 1F);
		Shape20.setTextureSize(114, 109);
		Shape20.mirror = true;
		setRotation(Shape20, 0F, 0F, 0F);
		Shape21 = new ModelRenderer(this, 23, 3);
		Shape21.addBox(0F, 0F, 0F, 2, 1, 1);
		Shape21.setRotationPoint(-4F, 22F, 2.5F);
		Shape21.setTextureSize(114, 109);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		Shape22 = new ModelRenderer(this, 25, 0);
		Shape22.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape22.setRotationPoint(-5F, 22F, 1F);
		Shape22.setTextureSize(114, 109);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 0F, 0F);
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
		Shape16.render(f5);
		Shape1.render(f5);
		Shape17.render(f5);
		Shape18.render(f5);
		Shape19.render(f5);
		Shape20.render(f5);
		Shape21.render(f5);
		Shape22.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}
	
}