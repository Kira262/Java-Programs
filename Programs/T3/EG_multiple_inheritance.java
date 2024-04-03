// 
interface i1 {
}

interface i2 {
}

class C1 implements i1, i2 {
}

//
interface i3 {
}

class C2 {
}

class C3 extends C2 implements i3 {
}

//
class C4 {
}

interface i4 {
}

class C5 extends C4 implements i4 {
}

//
interface i5 {
}

interface i6 {
}

interface iFinal extends i5, i6 {
}