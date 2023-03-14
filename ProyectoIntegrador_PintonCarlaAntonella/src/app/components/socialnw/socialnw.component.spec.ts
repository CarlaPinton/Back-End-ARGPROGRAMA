import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SocialnwComponent } from './socialnw.component';

describe('SocialnwComponent', () => {
  let component: SocialnwComponent;
  let fixture: ComponentFixture<SocialnwComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SocialnwComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SocialnwComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
