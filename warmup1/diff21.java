public int diff21(int n) {
  if (n <= 21){
    return 21-n;
  } else {
    return 2*Math.abs(21-n);
  }
}
