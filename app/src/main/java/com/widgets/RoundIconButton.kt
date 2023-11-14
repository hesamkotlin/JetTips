package com.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val IconButtonSizeModifier = Modifier.size(40.dp)

@Composable
fun roundIconButton(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    onClick: () -> Unit,
    tint: Color = Color.Black.copy(alpha = 0.8f),
    backGroundColor: Color = MaterialTheme.colors.background,
    elevation: Dp = 4.dp
) {
    Card(modifier = Modifier
        .padding(all = 4.dp)
        .clickable { onClick.invoke() }
        .then(IconButtonSizeModifier),
        shape = CircleShape,
        backgroundColor = backGroundColor,
        elevation = elevation) {
        Icon(imageVector = imageVector, contentDescription = "plus or minus icon", tint = tint)
    }
}