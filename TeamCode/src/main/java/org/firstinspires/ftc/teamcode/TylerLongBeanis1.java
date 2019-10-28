package org.firstinspires.ftc.teamcode;
import org.firstinspires.ftc.teamcode.auto.ChassisConfig;
import org.firstinspires.ftc.teamcode.autoOp.LongBeanis1;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

//Beanis = Square
//Hagrids = Slash

@Autonomous(name="Long Blue Beanis 1", group="a")
public class TylerLongBeanis1 extends LongBeanis1 {
    public TylerLongBeanis1() {
        super(ChassisConfig.forTileRunner());
    }
}