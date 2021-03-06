package org.nutz.el.opt;

import org.nutz.el.ElObj;
import org.nutz.el.ElValue;
import org.nutz.el.ann.*;
import org.nutz.lang.util.Context;

@Opt("+")
@Weight(10)
public class PlusOperator extends AbstractOperator {

	public ElValue execute(Context context, ElObj left, ElObj right) {
		ElValue l = left.eval(context);
		ElValue r = right.eval(context);
		return l.plus(r);
	}	

}
