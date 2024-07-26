package com.your_name.rotp_item_stand.client.render.entity.model.stand;

import com.your_name.rotp_item_stand.entity.stand.stands.ItemStandEntity;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.entity.pose.ModelPose;
import com.github.standobyte.jojo.client.render.entity.pose.RotationAngle;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ItemStandModel extends HumanoidStandModel<ItemStandEntity> {
/* THIS SHOULD BE EMPTY*/

	public ItemStandModel() {
		super();

		addHumanoidBaseBoxes(null);
		texWidth = 128;
		texHeight = 128;



	}


	@Override
	protected ModelPose initIdlePose() {
		return new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(leftArm, 0, 0, -0),

		});
	}


}