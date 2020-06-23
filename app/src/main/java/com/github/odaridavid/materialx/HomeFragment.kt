/**
 *
 * Copyright 2020 David Odari
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *            http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 **/
package com.github.odaridavid.materialx

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.card.MaterialCardView

//TODO Viewbinding? maybe
internal class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<MaterialCardView>(R.id.typography_card).setOnClickListener {
            navigateToTypography()
        }
        view.findViewById<MaterialCardView>(R.id.material_buttons_card).setOnClickListener {
            navigateToMaterialButtons()
        }
        view.findViewById<MaterialCardView>(R.id.color_palette_card).setOnClickListener {
            navigateToColorPalette()
        }
        view.findViewById<MaterialCardView>(R.id.animations_card).setOnClickListener {
            navigateToAnimations()
        }
    }

    private fun navigateToAnimations() {
        findNavController().navigate(R.id.action_homeFragment_to_animationsFragment)
    }

    private fun navigateToTypography() {
        findNavController().navigate(R.id.action_homeFragment_to_typographyFragment)
    }

    private fun navigateToMaterialButtons() {
        findNavController().navigate(R.id.action_homeFragment_to_materialButtonsFragment)
    }

    private fun navigateToColorPalette() {
        findNavController().navigate(R.id.action_homeFragment_to_colorPaletteFragment)
    }

}