package Aula06;

public class ControleRemoto implements Controlador{
	// Atributos
	public ControleRemoto() {
		this.volume= 50;
		this.volumeBackup= this.volume;
		this.ligado = false;
		this.tocando = false;
	}
	private int volumeBackup;
	private int volume;
	private boolean ligado;
	private boolean tocando;
	// Métodos especiais
	private int getVolumeBackup() {
		return volumeBackup;
	}
	private void setVolumeBackup(int volumeBackup) {
		this.volumeBackup = volumeBackup;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	// Métodos abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}
	@Override
	public void desligar() {
		this.setLigado(false);
	}
	@Override
	public void abrirMenu() {
		String aux = "";
		System.out.println("-----MENU-----");
		System.out.println("Está ligado? "+this.getLigado());
		System.out.println("Está tocando? "+this.getTocando());
		for(int volBar = 0; volBar<=this.getVolume(); volBar+=10) {
			aux+="=";
		}

		System.out.println("Volume:"+this.getVolume()+aux);
		System.out.println("");
	}
	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}
	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolumeBackup(this.getVolume());
			this.setVolume(this.getVolume()+1);
		}
		else {
			System.out.println("Impossível aumentar o volume");
		}
	}
	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolumeBackup(this.getVolume());
			this.setVolume(this.getVolume()-1);
		}
		else {
			System.out.println("Impossível diminuir o volume");
		}
	}
	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume()>0) {
			this.setVolumeBackup(this.getVolume());
			this.setVolume(0);
		}
		else {
			System.out.println("Impossível mutar");
		}
	}
	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume()==0) {
			this.setVolume(this.getVolumeBackup());
		}
		else {
			System.out.println("Impossível desmutar");
		}
	}
	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		else {
			System.out.println("Impossível reproduzir");
		}
	}
	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}
}
